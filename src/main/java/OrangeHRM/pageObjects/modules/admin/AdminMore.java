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
    String SuccessDeleteMessage = "Success\n" +
            "Successfully Deleted\n" +
            "×";

    String SuccessSavedMessage = "Success\n" +
            "Successfully Saved\n" +
            "×";

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

    @FindBy(xpath = "//span[normalize-space()='Configuration']")
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

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    private WebElement recorddeleteconfirm;

    @FindBy(xpath = "//button[normalize-space()='No, Cancel']")
    private WebElement recorddeletecancel;

    @FindBy(css = "#oxd-toaster_1")
    private WebElement operationsuccessmessage;

    //TODO - Admin More  Nationalities Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> nationalitiesrecords;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement nationalityname;

    @FindBy(xpath = "//span[normalize-space()='Already exists']")
    private WebElement alreadyexist;

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

    @FindBy(xpath = "(//label[normalize-space()='Date Format']/parent::div/parent::div/div[2]/div/div/div[2]")
    private WebElement dateformat;

    @FindBy(xpath = "//div[@class='oxd-select-option' and @role='option']")
    private List<WebElement> dateformatrecords;

    //TODO - Admin More Configuration Language Packages Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> languagepackagesrecords;

    @FindBy(xpath = "//label[normalize-space()='Name']/parent::div/parent::div/div[2]/div/div/div[2]")
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

    @FindBy(css = ".oxd-main-menu-item-wrapper")
    private List<WebElement> sidemenus;

    //TODO - Admin More Nationalities Page Method
    public void setOperationsOnNationalities(String NameOfTheNation, String NationRecordOperation) throws InterruptedException {
        //more.click();
        nationalities.click();
        Waits.shortPause();
        //WebElement NationRecords = nationalitiesRecordsSearch(NameOfTheNation);
        WebElement NationRecords = Search(nationalitiesrecords, NameOfTheNation);
        System.out.println(NationRecords.getText());
        if (NationRecordOperation.equalsIgnoreCase("Delete")) {
            NationRecords.findElement(deleted).click();
        } else if (NationRecordOperation.equalsIgnoreCase("Edit")) {
            NationRecords.findElement(edited).click();
        } else {
            System.out.println("Entered Value is not match in the Nationalities Records Operation");
            Assert.fail("Entered Value is not match in the Nationalities Records Operation");
        }
        Waits.shortPause();
        recorddeleteconfirm.click();
        Waits.shortPause();
        System.out.println(operationsuccessmessage.getText());
        Assert.assertEquals(operationsuccessmessage.getText(), SuccessDeleteMessage);
    }

    //TODO - Admin Adding Nationalities Records Method
    public void addNewNationalitiesRecord(String NameOfTheNation) throws InterruptedException {
        nationalities.click();
        Waits.shortPause();
        add.click();
        Waits.shortPause();
        nationalityname.sendKeys(NameOfTheNation);
        save.click();
        Waits.shortPause();
        waitforElementtoAppear(alreadyexist);

        if (alreadyexist.isDisplayed()) {
            setOperationsOnNationalities(NameOfTheNation, "Delete");
            Waits.pause();
            driver.getCurrentUrl();
            Waits.shortPause();
            nationalities.click();
            Waits.shortPause();
            driver.navigate().refresh();
            add.click();
            Waits.shortPause();
            nationalityname.sendKeys(NameOfTheNation);
            Waits.shortPause();
            save.click();
            waitforElementtoAppear(operationsuccessmessage);
            System.out.println(operationsuccessmessage.getText());
            Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
        } else {
            System.out.println(operationsuccessmessage.getText());
            Assert.assertEquals(operationsuccessmessage.getText(), SuccessDeleteMessage);
        }
    }

    //TODO - Admin Changing Corporate Branding Records Method
    public void addCorporateBranding(String PrimaryColorCode, String SecondaryColorCode, String PrimaryFontColorCode, String SecondaryFontColorCode, String GradientColorCode1, String GradientColorCode2, String DisplaySocialMediaYesNo) throws InterruptedException {
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

        if (DisplaySocialMediaYesNo.equalsIgnoreCase("Yes")) {
            System.out.println(socialmediaimages.isSelected());
        } else if (DisplaySocialMediaYesNo.equalsIgnoreCase("No")) {
            socialmediaimages.click();
        }
    }

    public void localizationconfiguration(String DateFormat) {
        configuration.click();
        localization.click();
        dateformat.click();
        WebElement dateformats = Search(dateformatrecords, DateFormat);
        System.out.println(dateformats.getText());
        dateformat.click();
        save.click();
    }

    public void languagepackagesconfiguration(String LanguagePackage) throws InterruptedException {
        configuration.click();
        languagepackages.click();
        add.click();
        languagepackagename.click();
        WebElement langpackages = Search(newlanguagepackrecords, LanguagePackage);
        String langpkg = langpackages.getText();
        System.out.println(langpkg);
        langpackages.click();
        save.click();
        Waits.shortPause();
        WebElement langrecords = Search(languagepackagesrecords, LanguagePackage);
        String langrec = langrecords.getText();
        System.out.println(langrec);
        Assert.assertEquals(langrec, LanguagePackage);
    }

    public void moduleconfiguration(String menu, String ShowHide) {
        configuration.click();
        moduleconfiguration.click();
        try {
            WebElement sidemenu = Search(sidemenus, menu);
            System.out.println(sidemenu.isDisplayed());

            //TODO - Leave Module
            if (menu.equalsIgnoreCase("Leave") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println("Module has been Show");
            } else if (menu.equalsIgnoreCase("Leave") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");

            }
            //TODO - Time Module
            else if (menu.equalsIgnoreCase("Time") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println("Module has been Show");
            } else if (menu.equalsIgnoreCase("Time") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");
            }
            //TODO - Recruitment Module
            else if (menu.equalsIgnoreCase("Recruitment") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println("Module has been Show");
            } else if (menu.equalsIgnoreCase("Recruitment") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");
            }

            //TODO - Performance Module
            else if (menu.equalsIgnoreCase("Performance") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println("Module has been Show");
            } else if (menu.equalsIgnoreCase("Performance") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");
            }

            //TODO - Directory Module
            else if (menu.equalsIgnoreCase("Directory") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println("Module has been Show");
            } else if (menu.equalsIgnoreCase("Directory") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");
            }

            //TODO - Maintenance Module
            else if (menu.equalsIgnoreCase("Maintenance") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println("Module has been Show");
            } else if (menu.equalsIgnoreCase("Maintenance") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");
            }

            //TODO - Mobile Module
            else if (menu.equalsIgnoreCase("Mobile") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println(" Module has been Show");
            } else if (menu.equalsIgnoreCase("Mobile") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been");
            }

            //TODO - Claim Module
            else if (menu.equalsIgnoreCase("Claim") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Show")) {
                System.out.println(menu + " Module has been Show");
            } else if (menu.equalsIgnoreCase("Claim") && sidemenu.isDisplayed() && ShowHide.equalsIgnoreCase("Hide")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Hide");
            }
        } catch (Exception e) {
            //TODO - Leave Module
            if (menu.equalsIgnoreCase("Leave") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Leave") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }
            //TODO - Time Module
            else if (menu.equalsIgnoreCase("Time") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Time") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }

            //TODO - Recruitment Module
            else if (menu.equalsIgnoreCase("Recruitment") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Recruitment") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }

            //TODO - Performance Module
            else if (menu.equalsIgnoreCase("Performance") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Performance") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }

            //TODO - Directory Module
            else if (menu.equalsIgnoreCase("Directory") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Directory") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }

            //TODO - Maintenance Module
            else if (menu.equalsIgnoreCase("Maintenance") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Maintenance") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }

            //TODO - Mobile Module
            else if (menu.equalsIgnoreCase("Mobile") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Mobile") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }

            //TODO - Claim Module
            else if (menu.equalsIgnoreCase("Claim") && ShowHide.equalsIgnoreCase("Hide")) {
                System.out.println(menu + " Module has been Hide");
                e.printStackTrace();
            } else if (menu.equalsIgnoreCase("Claim") && ShowHide.equalsIgnoreCase("Show")) {
                leavemodule.click();
                save.click();
                waitforElementtoAppear(operationsuccessmessage);
                System.out.println(operationsuccessmessage.getText());
                Assert.assertEquals(operationsuccessmessage.getText(), SuccessSavedMessage);
                System.out.println(menu + " Module has been Show");
                e.printStackTrace();
            }
        }
    }
}
