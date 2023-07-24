package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
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


    //TODO - Admin Adding new Job Titles
    public void adminAddJobTitles(String JobTitle, String JobDesc, String JobNotes) throws InterruptedException {
        job.click();
        Waits.shortPause();
        jobtitles.click();
        Waits.shortPause();
        addItems.click();
        Waits.shortPause();
        jobtitle.sendKeys(JobTitle);
        Waits.shortPause();
        jobdescription.sendKeys(JobDesc);
        Waits.shortPause();
        jobnote.sendKeys(JobNotes);
        Waits.shortPause();
        savesall.click();
        Waits.shortPause();
        adminModule();
    }

    //TODO - Admin Adding new Pay Grades
    public void adminAddPayGrades(String PayGradeName, String CurrentCodeINR, String MinPay, String MaxPay) throws InterruptedException {
        job.click();
        Waits.shortPause();
        paygrades.click();
        Waits.shortPause();
        addpayc.click();
        Waits.shortPause();
        addpaygradename.sendKeys(PayGradeName);
        Waits.shortPause();
        savesall.click();

        //TODO - Admin Adding new New Currency

        addpayc.click();
        Waits.shortPause();
        currencycode.click();
        Waits.shortPause();
        selectCurrency(CurrentCodeINR);
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

    //TODO - Currency Selection
    private void selectCurrency(String CurrentCodeINR) throws InterruptedException {
        //countCurrency.forEach(curr->System.out.println(curr.getText()));
        WebElement currency = countCurrency.stream().filter(curr ->
                curr.getText().contains(CurrentCodeINR)).findFirst().orElse(null);
        System.out.println(currency);
        currency.click();
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
        Waits.shortPause();
        adminModule();
    }

    //TODO - Admin Adding New Job Categories
    public void adminAddWorkshift(String ShiftName, String FromStartHour, String FromStartMin, String FromAMPM, String ToEndHour, String ToEndMin, String ToAMPM) throws InterruptedException {
        job.click();
        Waits.shortPause();
        workshifts.click();
        Waits.shortPause();
        addItems.click();
        Waits.shortPause();
        shiftname.sendKeys(ShiftName);
        Waits.shortPause();

        fromtime.click();
        Waits.shortPause();
        timehours.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        timehours.sendKeys(FromStartHour);
        Waits.shortPause();
        timeminute.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        timeminute.sendKeys(FromStartMin);
        Waits.shortPause();
        if (FromAMPM.equalsIgnoreCase("AM")) {
            timeam.click();
        } else if (FromAMPM.equalsIgnoreCase("PM")) {
            timepm.click();
        } else {
            System.out.println("Entered Value is not match with AM or PM");
            Assert.fail("Entered Value is not match with AM or PM");
        }
        Waits.pause();
        totime.click();
        Waits.shortPause();
        timehours.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        timehours.sendKeys(ToEndHour);
        Waits.shortPause();
        timeminute.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        timeminute.sendKeys(ToEndMin);
        Waits.shortPause();
        if (ToAMPM.equalsIgnoreCase("AM")) {
            timeam.click();
        } else if (ToAMPM.equalsIgnoreCase("PM")) {
            timepm.click();
        } else {
            System.out.println("Entered Value is not match with AM or PM");
            Assert.fail("Entered Value is not match with AM or PM");
        }
        Waits.shortPause();
        savesall.click();
        Waits.shortPause();
        adminModule();
    }
}
