package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class AdminPage extends GlobalPageObjects {
    WebDriver driver;

    public AdminPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //TODO - Admin Adding new Admin User PageObjects
    @FindBy(xpath = "//div[@class='orangehrm-header-container']/button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement adduser;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement userrole;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[1]")
    private WebElement roleselect;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    private WebElement roleadmin;

    @FindBy(xpath = "(//div[@class='oxd-select-option'])[2]")
    private WebElement roleess;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement empname;

    @FindBy(xpath = "(//div[@role='option'])[2]")
    private WebElement empresults;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement status;

    @FindBy(xpath = "(//div[@class='oxd-select-option' and @role='option'])[1]")
    private WebElement statusselect;

    @FindBy(xpath = "(//div[@class='oxd-select-option' and @role='option'])[2]")
    private WebElement statusenable;

    @FindBy(xpath = "(//div[@class='oxd-select-option' and @role='option'])[3]")
    private WebElement statusdisable;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]")
    private WebElement username;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input[@class='oxd-input oxd-input--active'])[1]")
    private WebElement password;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement confirmpassword;

    @FindBy(css = ".oxd-button--ghost")
    private WebElement cancel;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement save;

    //TODO - Admin Searching Admin User PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement searchusername;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement searchuserrole;

    @FindBy(xpath = "(//div[@role='option'])[2]")
    private WebElement searchuseradmin;

    @FindBy(xpath = "(//div[@role='option'])[3]")
    private WebElement searchuseress;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement searchempname;

    @FindBy(xpath = "//div[@role='listbox']")
    private WebElement empResult;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement searchstatus;

    @FindBy(xpath = "(//div[@role='option']/span)[1]")
    private WebElement searchstatusEnable;

    @FindBy(xpath = "(//div[@role='option']/span)[2]")
    private WebElement searchstatusDisable;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement search;

    @FindBy(xpath = ".oxd-button--ghost")
    private WebElement reset;

    @FindBy(css = ".oxd-toast-container--bottom")
    private WebElement norecordfound;

    //TODO - Admin Adding new Admin User
    public void addAdminUser(String SelectRole, String EmpName, String SelectStatus, String UserName, String UserPassword, String ConfirmPassword) throws InterruptedException {
        adduser.click();
        Waits.pause();
        userrole.click();
        Waits.shortPause();

        Actions roles = new Actions(driver);
        if (SelectRole.equalsIgnoreCase("Admin")) {
            roles.doubleClick(roleadmin).build().perform();
        } else if (SelectRole.equalsIgnoreCase("ESS")) {
            roles.doubleClick(roleess).build().perform();
        } else {
            System.out.println("Dropdown value is not correct to Select User");
            Assert.fail("Incorrect Dropdown value is not correct to Select User");
        }
        Waits.shortPause();

        Actions empnam = new Actions(driver);
        if (EmpName.equalsIgnoreCase(EmpName)) {
            empnam.sendKeys(empname, EmpName).build().perform();
            Waits.longPause();
            empresults.click();

        } else {
            System.out.println("Dropdown value is not correct to Select User");
            Assert.fail("Incorrect Dropdown value is not correct to Select User");
        }

        Waits.shortPause();
        status.click();
        Waits.shortPause();

        Actions status = new Actions(driver);
        if (SelectStatus.equalsIgnoreCase("Enabled")) {
            status.doubleClick(statusenable).build().perform();
        } else if (SelectStatus.equalsIgnoreCase("Disabled")) {
            status.doubleClick(statusdisable).build().perform();
        } else {
            System.out.println("Dropdown value is not correct to Status");
            Assert.fail("Incorrect Dropdown value to Status");
        }
        Waits.shortPause();
        username.sendKeys(UserName);
        Waits.shortPause();
        password.sendKeys(UserPassword);
        Waits.shortPause();
        confirmpassword.sendKeys(ConfirmPassword);
        Waits.shortPause();
        save.click();
    }

    //TODO - Admin Searching Employee By UserName
    public void searchByUserName(String SearchUserName) throws InterruptedException {
        searchusername.sendKeys(SearchUserName);
        search.click();
        Waits.pause();
    }

    //TODO - Admin Searching Employee By UserRole
    public void searchByUserRole(String UserRole) throws InterruptedException {
        searchuserrole.click();
        Waits.shortPause();
        if (UserRole.equalsIgnoreCase("Admin")) {
            searchuseradmin.click();
        } else if (UserRole.equalsIgnoreCase("ESS")) {
            searchuseress.click();
        } else {
            System.out.println("Dropdown value is not correct to Search UserRole");
            Assert.fail("Incorrect Dropdown value to Search UserRole");
        }
        search.click();
    }

    //TODO - Admin Searching Employee By Name
    public void searchByEmpName(String EMPName) throws InterruptedException {
        Actions searchempnam = new Actions(driver);
        if (EMPName.equalsIgnoreCase(EMPName)) {
            searchempnam.sendKeys(searchempname, EMPName).build().perform();
            Waits.shortPause();
            empResult.click();
        } else {
            System.out.println("Dropdown value is not correct to Search EMPName");
            Assert.fail("Incorrect Dropdown value to Search EMPName");
        }
    }

    //TODO - Admin Searching Employee By Status
    public void searchByStatus(String SearchStatus) throws InterruptedException {
        searchstatus.click();
        Waits.shortPause();
        if (SearchStatus.equalsIgnoreCase("Enabled")) {
            searchstatusEnable.click();
        } else if (SearchStatus.equalsIgnoreCase("Disabled")) {
            searchstatusDisable.click();
        } else {
            System.out.println("Dropdown value is not correct to Search Status");
            Assert.fail("Incorrect Dropdown value to Search Status");
        }
        search.click();
    }
}


