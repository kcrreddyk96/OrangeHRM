package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Browser;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminOrganization extends GlobalPageObjects {
    WebDriver driver;

    public AdminOrganization(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //TODO - Admin Organization PageObjects
    @FindBy(xpath = "//span[normalize-space()='Organization']")
    private WebElement organization;

    @FindBy(xpath = "//a[normalize-space()='General Information']")
    private WebElement generalinformation;

    @FindBy(xpath = "//a[normalize-space()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//a[normalize-space()='Structure']")
    private WebElement structure;

    //TODO - Admin General Information PageObjects
    @FindBy(css = ".oxd-switch-input--active")
    private WebElement generaleditcheckbox;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement generalorganizationname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement generalregistrationnumber;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    private WebElement generaltaxid;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
    private WebElement generalphonenumber;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
    private WebElement generalfax;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
    private WebElement generalemail;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
    private WebElement generaladdressstreet1;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[9]")
    private WebElement generaladdressstreet2;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[10]")
    private WebElement generalcity;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[11]")
    private WebElement generalprovince;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[12]")
    private WebElement generalpostalcode;

    @FindBy(css = ".oxd-select-text--active")
    private List<WebElement> generalcountry;

    @FindBy(css = ".oxd-textarea")
    private WebElement generalnotes;

    @FindBy(css =".oxd-button--medium")
    private WebElement save;

    //TODO - Admin Locations Search PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement locationsname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement locationscity;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    private WebElement locationscountry;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> selectscountry;

    @FindBy(css =".orangehrm-left-space")
    private WebElement search;

    @FindBy(css =".oxd-button--ghost")
    private WebElement reset;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addlocation;

    //TODO - Admin Add Location Page Objects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[1]")
    private WebElement locationname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[2]")
    private WebElement locationcity;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[3]")
    private WebElement locationprovince;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[4]")
    private WebElement locationpostalcode;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[5]")
    private WebElement locationphone;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[6]")
    private WebElement locationfax;

    @FindBy(xpath = "(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical' and @placeholder='Type here ...'])[1]")
    private WebElement locationaddress;

    @FindBy(xpath = "(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical' and @placeholder='Type here ...'])[1]")
    private WebElement locationnotes;

    @FindBy(xpath = ".orangehrm-left-space")
    private WebElement locationsave;

    //TODO - Admin Organization Structure Page Objects
    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
    private WebElement organizationedit;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary org-structure-add']")
    private WebElement addorganization;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement addunitid;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement addunitname;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    private WebElement addunitdesc;

    @FindBy(xpath = ".orangehrm-left-space")
    private WebElement unitsave;

    @FindBy(css =".oxd-dialog-close-button-position")
    private WebElement xclose;
}


