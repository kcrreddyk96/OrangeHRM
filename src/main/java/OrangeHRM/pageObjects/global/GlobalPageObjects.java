package OrangeHRM.pageObjects.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GlobalPageObjects {
    WebDriver driver;

    public GlobalPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement adminPage;

    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement PMIPage;

    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leavePage;

    @FindBy(xpath = "//span[normalize-space()='Time']")
    WebElement timePage;

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement recruitmentPage;

    @FindBy(xpath = "//span[normalize-space()='My Info']")
    WebElement myInfoPage;

    @FindBy(xpath = "//span[normalize-space()='Performance']")
    WebElement performancePage;

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement dashboardPage;

    @FindBy(xpath = "//span[normalize-space()='Directory']")
    WebElement directoryPage;

    @FindBy(xpath = "//span[normalize-space()='Maintenance']")
    WebElement maintenancePage;

    @FindBy(xpath = "//span[normalize-space()='Buzz']")
    WebElement buzzPage;

    @FindBy(css = ".bi-chevron-right")
    WebElement bugerIconClosed;

    @FindBy(css = ".bi-chevron-left")
    WebElement bugerIconOpened;

    @FindBy(css = ".oxd-userdropdown-tab")
    WebElement userProfileDropdown;

    @FindBy(xpath = "//a[normalize-space()='About']")
    WebElement about;

    @FindBy(xpath = "//a[normalize-space()='Support']")
    WebElement support;

    @FindBy(xpath = "//a[normalize-space()='Change Password']")
    WebElement changePassword;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    public void setSearch(String SearchString) {
        search.sendKeys(SearchString);
    }

    public void profiledropdown(String SelectDropdown) {
        Select dropdown = new Select(userProfileDropdown);
        if (SelectDropdown.equalsIgnoreCase("about")) {
            dropdown.selectByVisibleText("About");
        } else if (SelectDropdown.equalsIgnoreCase("support")) {
            dropdown.selectByVisibleText("Support");
        } else if (SelectDropdown.equalsIgnoreCase("change password")) {
            dropdown.selectByVisibleText("Change Password");
        } else if (SelectDropdown.equalsIgnoreCase("logout")) {
            dropdown.selectByVisibleText("Logout");
        } else {
            System.out.println("Dropdown value is not correct to select");
        }
    }
}