package OrangeHRM.pageObjects.global;

import OrangeHRM.utilities.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends GlobalPageObjects {
    WebDriver driver;

    String currentURL;

    @FindBy(css = ".oxd-topbar-header-breadcrumb-module")
    private WebElement currentpage;

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    WebElement userpassword;

    @FindBy(css = ".orangehrm-login-button")
    WebElement userlogin;

    @FindBy(xpath = "//p[normalize-space()='Forgot your password?']")
    WebElement forgotPassword;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement forgotusername;

    @FindBy(css = ".orangehrm-forgot-password-button--cancel")
    WebElement forgotcancel;

    @FindBy(xpath = ".orangehrm-forgot-password-button--reset")
    WebElement resetpassword;

    @FindBy(css = ".oxd-alert-content-text")
    private WebElement errortext;

    @FindBy(css = ".oxd-alert--error")
    private WebElement errormessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getURL(String pageURL) {
        driver.get(pageURL);
    }

    public void resetDetails(String UserName) {
        forgotPassword.click();
        forgotusername.sendKeys(UserName);
    }

    public void resetPassword() {
        resetpassword.click();
    }

    public void resetcancel() {
        forgotcancel.click();
    }


    public String getCurrentPageURL() {
        currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public String getCurrentPageTitle() {
        String currentPage = currentpage.getText();
        return currentPage;
    }

    public String getErrorMessage() throws InterruptedException {
        Waits.shortPause();
        String error = errortext.getText();
        return error;
    }

    public String errorValidationTest() throws InterruptedException {
        if (getCurrentPageURL().contains("auth/login")) {
            getErrorMessage();
            Assert.fail("Test Failed due to " + getErrorMessage());
            return getErrorMessage();
        } else {
            String successmessage = "Login Successful";
            getCurrentPageTitle();
            Assert.assertEquals(getCurrentPageTitle(), "Dashboard");
            System.out.println(successmessage);
            return getCurrentPageTitle();
        }
    }

    public void setLogin(String UserName, String UserPassword) throws InterruptedException {
        username.sendKeys(UserName);
        userpassword.sendKeys(UserPassword);
        userlogin.click();
        Waits.shortPause();
        errorValidationTest();
    }
}
