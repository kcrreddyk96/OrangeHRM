package OrangeHRM.pageObjects.global;

import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class GlobalPageObjects {
    WebDriver driver;

    public GlobalPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement search;

    @FindBy(xpath = "//span[normalize-space()='Admin']")
    private WebElement adminPage;

    @FindBy(xpath = "//span[normalize-space()='PIM']")
    private WebElement PMIPage;

    @FindBy(xpath = "//span[normalize-space()='Leave']")
    private WebElement leavePage;

    @FindBy(xpath = "//span[normalize-space()='Time']")
    private WebElement timePage;

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    private WebElement recruitmentPage;

    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoPage;

    @FindBy(xpath = "//span[normalize-space()='Performance']")
    private WebElement performancePage;

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    private WebElement dashboardPage;

    @FindBy(xpath = "//span[normalize-space()='Directory']")
    private WebElement directoryPage;

    @FindBy(xpath = "//span[normalize-space()='Maintenance']")
    private WebElement maintenancePage;

    @FindBy(xpath = "//span[normalize-space()='Buzz']")
    private WebElement buzzPage;

    @FindBy(css = ".bi-chevron-left")
    private WebElement bugerIconClosed;

    @FindBy(css = ".bi-chevron-right")
    private WebElement bugerIconOpened;

    @FindBy(xpath = "//div[@class='oxd-topbar-header-userarea']/ul/li/span/i")
    private WebElement userProfileDropdown;

    @FindBy(xpath = "//a[normalize-space()='About']")
    private WebElement about;

    @FindBy(xpath = "//a[normalize-space()='Support']")
    private WebElement support;

    @FindBy(xpath = "//a[normalize-space()='Change Password']")
    private WebElement changePassword;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logout;

    By results = By.xpath("//li[@class='oxd-main-menu-item-wrapper']");

    @FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
    private WebElement selectItem;

    public void profiledropdown(String SelectDropdown) throws InterruptedException {
        userProfileDropdown.click();
        Waits.shortPause();
        Actions profiledrop = new Actions(driver);

        if (SelectDropdown.equalsIgnoreCase("about")) {
            profiledrop.doubleClick(about).build().perform();
        } else if (SelectDropdown.equalsIgnoreCase("support")) {
            profiledrop.doubleClick(support).build().perform();
        } else if (SelectDropdown.equalsIgnoreCase("change password")) {
            profiledrop.doubleClick(changePassword).build().perform();
        } else if (SelectDropdown.equalsIgnoreCase("logout")) {
            profiledrop.doubleClick(logout).build().perform();
        } else {
            System.out.println("Dropdown value is not correct to select");
            Assert.fail("Dropdown value is not correct to select");
        }
    }

    public void closeBugerIcon() {
        bugerIconClosed.click();
    }

    public void openBugerIcon() {
        bugerIconOpened.click();
    }

    public void setSearch(String SearchString) {
        Actions searchItems = new Actions(driver);
        searchItems.sendKeys(search, SearchString).build().perform();
        selectItem.click();
    }

    public void adminModule() {
        adminPage.click();
    }

    public void pimModule() {
        PMIPage.click();
    }

    public void leaveModule() {
        leavePage.click();
    }

    public void timeModule() {
        timePage.click();
    }

    public void recruitmentModule() {
        recruitmentPage.click();
    }

    public void myInfoModule() {
        myInfoPage.click();
    }

    public void performanceModule() {
        performancePage.click();
    }

    public void dashboardModule() {
        dashboardPage.click();
    }

    public void directoryModule() {
        directoryPage.click();
    }

    public void maintenanceModule() {
        maintenancePage.click();
    }

    public void buzzModule() {
        buzzPage.click();
    }


    public void waitforElementtoAppear(By findBy) { // TODO - Visibility of Web Element using BY Locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void waitforElementtoAppear(WebElement findBy) { // TODO - Visibility of Web Element using WebElement Locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void waitforElementtoDisappear(WebElement element) { // TODO - invisibility of Web Element using WebElement Locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}