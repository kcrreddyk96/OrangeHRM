package OrangeHRM.pageObjects.modules;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends GlobalPageObjects {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //TODO - Dashboard Quick Launch
    @FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Assign Leave']")
    private WebElement assignleave;

    @FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Leave List']")
    private WebElement leavelist;

    @FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Timesheets']")
    private WebElement timesheets;

    @FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Apply Leave']")
    private WebElement applyleave;

    @FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='My Leave']")
    private WebElement myleave;

    @FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='My Timesheet']")
    private WebElement mytimesheet;

    //TODO - Dashboard My Actions
    @FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[1]")
    private WebElement leaverequests;

    @FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[2]")
    private WebElement timesheetapprove;

    @FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[3]")
    private WebElement pendingselfreview;

    @FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[4]")
    private WebElement candtointerview;

    public void setQuickLaunch(String QuickLaunch) {
        if (QuickLaunch.contains("Assign Leave")) {
            assignleave.click();
        } else if (QuickLaunch.contains("Leave List")) {
            leavelist.click();
        } else if (QuickLaunch.contains("Timesheets")) {
            timesheets.click();
        } else if (QuickLaunch.contains("Apply Leave")) {
            applyleave.click();
        } else if (QuickLaunch.contains("My Leave")) {
            myleave.click();
        } else if (QuickLaunch.contains("My Timesheet")) {
            mytimesheet.click();
        } else {
            System.out.println("Entered Value is not match in Quick Launch");
            Assert.fail("Entered Value is not match in Quick Launch");
        }
    }

    public void setMyActions(String MyActions) {
        if (MyActions.contains("Leave Requests")) {
            leaverequests.click();
        } else if (MyActions.contains("Timesheets to Approve")) {
            timesheetapprove.click();
        } else if (MyActions.contains("Pending Self Review")) {
            pendingselfreview.click();
        } else if (MyActions.contains("Candidate to Interview")) {
            candtointerview.click();
        } else {
            System.out.println("Entered Value is not match in My Actions");
            Assert.fail("Entered Value is not match in My Actions");
        }
    }
}
