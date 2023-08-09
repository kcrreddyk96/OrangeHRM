package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AdminJob extends GlobalPageObjects {
    WebDriver driver;

    public AdminJob(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //TODO - Admin Job Dropdown Titles PageObjects
    @FindBy(xpath = "//span[normalize-space()='Job']")
    private WebElement job;

    @FindBy(xpath = "//a[normalize-space()='Job Titles']")
    private WebElement jobtitles;

    @FindBy(xpath = "//a[normalize-space()='Pay Grades']")
    private WebElement paygrades;

    @FindBy(xpath = "//a[normalize-space()='Employment Status']")
    private WebElement employmentstatus;

    @FindBy(xpath = "//a[normalize-space()='Job Categories']")
    private WebElement jobcategories;

    @FindBy(xpath = "//a[normalize-space()='Work Shifts']")
    private WebElement workshifts;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement savesall;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    private WebElement cancelsall;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addItems;

    @FindBy(css = ".bi-trash")
    private WebElement deleteopt;

    //TODO - Admin Job Titles PageObjects

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement jobtitle;

    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    private WebElement jobdescription;

    @FindBy(xpath = "//textarea[@placeholder='Add note']")
    private WebElement jobnote;

    //TODO - Admin Pay Grades PageObjects
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addpayc;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement addpaygradename;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    private WebElement currencycode;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> countCurrency;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement minpay;

    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input)[3]")
    private WebElement maxpay;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[2]")
    private WebElement currencysave;

    @FindBy(xpath = "//span[normalize-space()='Already exists']")
    private WebElement alreadyexist;

    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> paygradesrecords;

    @FindBy(css = ".oxd-table-row--with-border")
    private WebElement paygradesrec;

    //TODO - Admin Employment Status PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement employmentname;

    //TODO - Admin Job Categories PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement jobcategoriename;

    //TODO - Admin Job Categories PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement shiftname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='hh:mm'])[1]")
    private WebElement fromtime;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='hh:mm'])[2]")
    private WebElement totime;

    @FindBy(css = ".oxd-time-hour-input-text")
    private WebElement timehours;

    @FindBy(css = ".oxd-time-minute-input-text")
    private WebElement timeminute;

    @FindBy(xpath = "//input[@name='am']")
    private WebElement timeam;

    @FindBy(xpath = "//input[@name='pm']")
    private WebElement timepm;

    @FindBy(css = ".oxd-padding-cell")
    private List<WebElement> recordsData;


    //TODO - Admin Adding new Job Titles
    public void adminAddJobTitles(String JobTitle, String JobDesc, String JobNotes) throws InterruptedException {
        job.click();
        jobtitles.click();
        addItems.click();
        jobtitle.sendKeys(JobTitle);
        jobdescription.sendKeys(JobDesc);
        jobnote.sendKeys(JobNotes);
        savesall.click();
        Waits.shortPause();
        adminModule();
    }

    //TODO - Admin Adding new Pay Grades
    public void adminAddPayGrades(String PayGradeName, String CurrentCodeINR, String MinPay, String MaxPay) throws InterruptedException {
        job.click();
        paygrades.click();
        addpayc.click();
        addpaygradename.sendKeys(PayGradeName);
        savesall.click();
        Waits.shortPause();

        if (alreadyexist.isDisplayed()) {
            job.click();
            Waits.shortPause();
            paygrades.click();
            Waits.shortPause();
            DeleteRecords(paygradesrecords, PayGradeName);
            Waits.shortPause();
            waitforElementtoAppear(paygradesrec);
            addpayc.click();
            addpaygradename.sendKeys(PayGradeName);
            savesall.click();
        } else {
            System.out.println("no data found");
        }
        //TODO - Admin Adding new New Currency

        addpayc.click();
        Waits.shortPause();
        currencycode.click();
        Waits.shortPause();
        WebElement currency = Search(countCurrency, CurrentCodeINR);
        currency.click();
        Waits.shortPause();
        minpay.sendKeys(MinPay);
        maxpay.sendKeys(MaxPay);
        Waits.shortPause();
        currencysave.click();
        Waits.shortPause();
        job.click();
        Waits.shortPause();
        paygrades.click();
        Waits.shortPause();
        adminModule();
    }

    public void paygrade(String PayGradeName, String CurrentCodeINR, String MinPay, String MaxPay) throws InterruptedException {
        adminAddPayGrades(PayGradeName, CurrentCodeINR, MinPay, MaxPay);

    }

    //TODO - Admin Adding New Employment Status
    public void adminAddingNewEmploymentStatus(String EmploymentName) throws InterruptedException {
        job.click();
        Waits.shortPause();
        employmentstatus.click();
        Waits.shortPause();
        addItems.click();
        Waits.shortPause();
        employmentname.sendKeys(EmploymentName);
        Waits.shortPause();
        savesall.click();
        Waits.shortPause();
        adminModule();
    }

    //TODO - Admin Adding New Job Categories
    public void adminAddJobCategories(String JobCategorieName) throws InterruptedException {
        job.click();
        Waits.shortPause();
        jobcategories.click();
        Waits.shortPause();
        addItems.click();
        Waits.shortPause();
        jobcategoriename.sendKeys(JobCategorieName);
        Waits.shortPause();
        savesall.click();
        Waits.pause();
        WebElement records = Search(recordsData, JobCategorieName);
        String recordname = records.getText();
        System.out.println(recordname);
        Assert.assertEquals(recordname, JobCategorieName);
        adminModule();
    }

    //TODO - Admin Adding New Job Categories
    public void adminAddWorkshift(String ShiftName, String FromStartHour, String FromStartMin, String FromAMPM, String ToEndHour, String ToEndMin, String ToAMPM) throws InterruptedException {
        job.click();
        workshifts.click();
        addItems.click();
        shiftname.sendKeys(ShiftName);
        fromtime.click();
        timehours.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        timehours.sendKeys(FromStartHour);
        Waits.shortPause();
        timeminute.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        timeminute.sendKeys(FromStartMin);
        if (FromAMPM.equalsIgnoreCase("AM")) {
            timeam.click();
        } else if (FromAMPM.equalsIgnoreCase("PM")) {
            timepm.click();
        } else {
            System.out.println("Entered Value is not match with AM or PM");
            Assert.fail("Entered Value is not match with AM or PM");
        }
        totime.click();
        timehours.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        timehours.sendKeys(ToEndHour);
        timeminute.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        timeminute.sendKeys(ToEndMin);
        if (ToAMPM.equalsIgnoreCase("AM")) {
            timeam.click();
        } else if (ToAMPM.equalsIgnoreCase("PM")) {
            timepm.click();
        } else {
            System.out.println("Entered Value is not match with AM or PM");
            Assert.fail("Entered Value is not match with AM or PM");
        }
        savesall.click();
        adminModule();
    }

    //public void AddWorkshift(String ShiftName, String FromStartHour, String FromStartMin, String FromAMPM, String ToEndHour, String ToEndMin, String ToAMPM) throws InterruptedException {
    //adminAddWorkshift(ShiftName, FromStartHour, FromStartMin, FromAMPM, ToEndHour, ToEndMin, ToAMPM);
    public void AddWorkshift() throws InterruptedException {
        job.click();
        workshifts.click();
        WebElement records = Search(recordsData, "Twilight");
        System.out.println(records.getText());
    }
}
