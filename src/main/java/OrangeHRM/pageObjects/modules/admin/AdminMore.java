package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AdminMore extends GlobalPageObjects {
    WebDriver driver;

    public AdminMore(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //TODO - Admin Qualifications More Page Object Elements
    @FindBy(css = ".orangehrm-main-title")
    private WebElement MainTitle;

    @FindBy(xpath = "//span[normalize-space()='More']")
    private WebElement more;

    @FindBy(xpath = "//a[normalize-space()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//a[normalize-space()='Corporate Branding']")
    private WebElement corporatebranding;

    @FindBy(xpath = "//a[normalize-space()='Configuration']")
    private WebElement configuration;

    //TODO - Admin More Configuration Sub Modules Page Object Elements
    @FindBy(xpath = "//a[normalize-space()='Email Configuration']")
    private WebElement emailconfiguration;

    @FindBy(xpath = "//a[normalize-space()='Email Subscriptions']")
    private WebElement emailsubscriptions;

    @FindBy(xpath = "//a[normalize-space()='Localization']")
    private WebElement localization;

    @FindBy(xpath = "//a[normalize-space()='Language Packages']")
    private WebElement languagepackages;

    @FindBy(xpath = "//a[normalize-space()='Modules']")
    private WebElement moduleconfiguration;

    @FindBy(xpath = "//*[normalize-space()='Add']")
    private WebElement add;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement save;

    @FindBy(css = ".oxd-button--ghost")
    private WebElement cancel;

    By approvecheckbox = By.xpath("(//*[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]");

    By deleted = By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]");

    By edited = By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]");

    @FindBy(css = ".oxd-switch-input--active")
    private WebElement checkbox;

    //TODO - Admin More  Nationalities Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> nationalitiesrecords;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement nationalityname;

    //TODO - Admin More  Corporate Branding Page Object Elements
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement colorcode;

    @FindBy(xpath = "//*[normalize-space()='Primary Color']/div[2]/div")
    private WebElement primarycoloroption;

    @FindBy(xpath = "//*[normalize-space()='Secondary Color']/div[2]/div")
    private WebElement secondarycoloroption;

    @FindBy(xpath = "//*[normalize-space()='Primary Font Color']/div[2]/div")
    private WebElement primaryfontcolor;

    @FindBy(xpath = "//*[normalize-space()='Secondary Font Color']/div[2]/div")
    private WebElement secondaryfontcolor;

    @FindBy(xpath = "//*[normalize-space()='Primary Gradient Color 1']/div[2]/div")
    private WebElement primarygradientcolor1;

    @FindBy(xpath = "//*[normalize-space()='Primary Gradient Color 2']/div[2]/div")
    private WebElement primarygradientcolor2;

    @FindBy(xpath = "(//div[@class='oxd-file-div oxd-file-div--active'])[1]")
    private WebElement clientlogo;

    @FindBy(xpath = "(//div[@class='oxd-file-div oxd-file-div--active'])[1]")
    private WebElement clientbanner;

    @FindBy(xpath = "(//div[@class='oxd-file-div oxd-file-div--active'])[1]")
    private WebElement loginbanner;

    @FindBy(xpath = "(//*[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
    private WebElement socialmediaimages;

    @FindBy(xpath = "//*[normalize-space()='Reset to Default']")
    private WebElement resettodefault;

    @FindBy(xpath = "//*[normalize-space()='Preview']")
    private WebElement preview;

    @FindBy(xpath = "//*[normalize-space()='Publish']")
    private WebElement publish;

    //TODO - Admin More Configuration Email Configuration Page Object Elements

    @FindBy(xpath = "//*[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement mailsentas;

    @FindBy(xpath = "//input[@type='radio' and @value='smtps']")
    private WebElement smtps;

    @FindBy(xpath = "//input[@type='radio' and @value='smtp']")
    private WebElement smtp;

    @FindBy(xpath = "//input[@type='radio' and @value='sendmail']")
    private WebElement sendmail;

    //TODO - Admin More Configuration Subscriber Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> emailsubscriptionsrecords;

    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input)[1]")
    private WebElement subscribername;

    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input)[2]")
    private WebElement subscriberemail;

    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> subscribersrecords;

    //TODO - Admin More Configuration Localization Page Object Elements
    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
    private WebElement language;

    @FindBy(xpath = "//div[@class='oxd-select-option' and @role='option']")
    private List<WebElement> languagerecords;

    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
    private WebElement dateformat;

    @FindBy(xpath = "//div[@class='oxd-select-option' and @role='option']")
    private List<WebElement> dateformatrecords;

    //TODO - Admin More Configuration Language Packages Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> languagepackagesrecords;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    private WebElement languagepackagename;

    @FindBy(xpath = "//div[@class='oxd-select-option' and @role='option']")
    private List<WebElement> newlanguagepackrecords;

    By translate = By.xpath("(//*[normalize-space()='Translate'])[1]");

    By export = By.xpath("(//*[normalize-space()='Export'])[1]");

    @FindBy(css = ".oxd-table-header-sort")
    private WebElement languagepacksort;

    @FindBy(xpath = "//li[normalize-space()='Ascending']")
    private WebElement ascending;

    @FindBy(xpath = "//li[normalize-space()='Descending']")
    private WebElement descending;

    //TODO - Admin More Configuration Language Packages Page Object Elements
    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[3]")
    private WebElement leavemodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[4]")
    private WebElement timemodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[5]")
    private WebElement recruitmentmodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[6]")
    private WebElement performancemodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[7]")
    private WebElement directorymodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[8]")
    private WebElement maintenancemodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[9]")
    private WebElement mobilemodule;

    @FindBy(xpath = "(//div[@class='oxd-switch-wrapper'])[10]")
    private WebElement claimmodule;

    //TODO - Admin More Nationalities Page Method
    private WebElement nationalitiesRecordsSearch(String NameOfTheNation) {
        WebElement nationresult = nationalitiesrecords.stream().filter(national ->
                national.getText().contains(NameOfTheNation)).findFirst().orElse(null);
        System.out.println(nationresult);
        return nationresult;
    }

    public void setOperationsOnNationalities(String NameOfTheNation, String NationRecordOperation) throws InterruptedException {
        more.click();
        nationalities.click();
        Waits.shortPause();
        WebElement NationRecords = nationalitiesRecordsSearch(NameOfTheNation);

        if (NationRecordOperation.equalsIgnoreCase("Delete")) {
            NationRecords.findElement(deleted).click();
        } else if (NationRecordOperation.equalsIgnoreCase("Edit")) {
            NationRecords.findElement(edited).click();
        } else {
            System.out.println("Entered Value is not match in the Nationalities Records Operation");
            Assert.fail("Entered Value is not match in the Nationalities Records Operation");
        }
    }

    public void addNewNationalitiesRecord(String NationalName) throws InterruptedException {
        more.click();
        nationalities.click();
        Waits.shortPause();
        add.click();
        Waits.shortPause();
        nationalityname.sendKeys(NationalName);
        save.click();
    }

    public void addCorporateBranding(String PrimaryColorCode, String SecondaryColorCode, String PrimaryFontColorCode, String SecondaryFontColorCode, String GradientColorCode1, String GradientColorCode2, String DisplaySocialMediaYesNo) throws InterruptedException {
        more.click();
        corporatebranding.click();
        Waits.shortPause();
        primarycoloroption.click();
        colorcode.sendKeys(PrimaryColorCode);
        Waits.shortPause();
        secondarycoloroption.click();
        colorcode.sendKeys(SecondaryColorCode);
        Waits.shortPause();
        primaryfontcolor.click();
        colorcode.sendKeys(PrimaryFontColorCode);
        Waits.shortPause();
        secondaryfontcolor.click();
        colorcode.sendKeys(SecondaryFontColorCode);
        Waits.shortPause();
        primarygradientcolor1.click();
        colorcode.sendKeys(GradientColorCode1);
        Waits.shortPause();
        primarygradientcolor2.click();
        colorcode.sendKeys(GradientColorCode2);
        Waits.shortPause();
        /*
        clientlogo
        Uses AutoIT Here
         */

        if (DisplaySocialMediaYesNo.equalsIgnoreCase("Yes")){
            System.out.println(socialmediaimages.isSelected());
        } else if (DisplaySocialMediaYesNo.equalsIgnoreCase("No")) {
            socialmediaimages.click();
        }

    }


}