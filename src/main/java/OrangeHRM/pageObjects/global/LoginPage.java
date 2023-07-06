package OrangeHRM.pageObjects.global;

import OrangeHRM.pageObjects.global.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    String currentURL;

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

    public LoginPage(WebDriver driver) {
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


    public HomePage setLogin(String UserName, String UserPassword) {
        username.sendKeys(UserName);
        userpassword.sendKeys(UserPassword);
        userlogin.click();
        HomePage homepage = new HomePage(driver);
        return homepage;
    }
}
