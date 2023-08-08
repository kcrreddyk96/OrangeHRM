package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Scroll;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.Keys.CONTROL;

public class AdminOrganization extends GlobalPageObjects {
    WebDriver driver;
    WebElement OrgResults;

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
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters organization-name-container']/div/div[2]/input")
    private WebElement generalorganizationname;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[1]")
    private WebElement generalregistrationnumber;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[2]")
    private WebElement generaltaxid;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[3]")
    private WebElement generalphonenumber;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[4]")
    private WebElement generalfax;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[5]")
    private WebElement generalemail;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[6]")
    private WebElement generaladdressstreet1;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[7]")
    private WebElement generaladdressstreet2;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[8]")
    private WebElement generalcity;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[9]")
    private WebElement generalprovince;

    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input)[10]")
    private WebElement generalpostalcode;

    @FindBy(css = ".oxd-select-text--active")
    private List<WebElement> generalcountry;

    @FindBy(css = ".oxd-textarea")
    private WebElement generalnotes;

    @FindBy(css = ".oxd-button--medium")
    private WebElement save;

    //TODO - Admin Locations Search PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement locationsname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement locationscity;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    private WebElement locationscountry;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement country;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> selectscountry;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement search;

    @FindBy(css = ".oxd-button--ghost")
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

    @FindBy(xpath = "//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--pastel-white org-structure-card --edit']")
    private List<WebElement> structureElements;

    By strDelete = By.xpath("(//div[@class='org-action']/button[@class='oxd-icon-button org-action-icon'])[1]");

    By strEdit = By.xpath("(//div[@class='org-action']/button[@class='oxd-icon-button org-action-icon'])[2]");

    By strAddUnit = By.xpath("(//div[@class='org-action']/button[@class='oxd-icon-button org-action-icon'])[3]");

    @FindBy(css = ".oxd-button--label-danger")
    private WebElement yesDelete;

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

    @FindBy(css = ".oxd-dialog-close-button-position")
    private WebElement xclose;

    private void selectCountry(String SelectedCountry) {
        country.click();
        WebElement countryresult = selectscountry.stream().filter(country -> country.getText().equalsIgnoreCase(SelectedCountry)).findFirst().orElse(null);
        System.out.println(countryresult);
        countryresult.click();
    }

    //TODO - Admin Access And Edit General Information
    public void accessAndEditGeneralInformation(String GeneralORGName, String GeneralRegistrationNumber, String GeneralTaxID, String GeneralPhone, String GeneralFax, String GeneralAddress1, String GeneralAddress2, String GeneralCity, String GeneralProvince, String GeneralPostal, String SelectedCountry, String GeneralNotes) throws InterruptedException {
        organization.click();
        generalinformation.click();
        generaleditcheckbox.click();
        Waits.shortPause();
        generalorganizationname.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalorganizationname.sendKeys(GeneralORGName);

        generalregistrationnumber.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalregistrationnumber.sendKeys(GeneralRegistrationNumber);

        generaltaxid.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generaltaxid.sendKeys(GeneralTaxID);

        generalphonenumber.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalphonenumber.sendKeys(GeneralPhone);

        generalfax.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalfax.sendKeys(GeneralFax);

        generaladdressstreet1.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generaladdressstreet1.sendKeys(GeneralAddress1);

        generaladdressstreet2.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();

        generalcity.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalcity.sendKeys(GeneralCity);

        generalprovince.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalprovince.sendKeys(GeneralProvince);

        generalpostalcode.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalpostalcode.sendKeys(GeneralPostal);

        Scroll.longScrollDown(driver);
        selectCountry(SelectedCountry);

        generalnotes.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalnotes.sendKeys(GeneralNotes);
        save.click();
    }

    //TODO - Admin search Locations
    public void searchLocations(String LocationName, String LocationCity, String SelectedCountry) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        locations.click();
        locationsname.sendKeys(LocationName);
        locationscity.sendKeys(LocationCity);
        selectCountry(SelectedCountry);
        Waits.shortPause();
        search.click();
    }

    //TODO - Admin Add Locations
    public void addLocation(String Name, String City, String Province, String SelectedCountry, String Phone, String Fax, String SendAddress, String LocationNotes) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        locations.click();
        addlocation.click();
        Waits.shortPause();
        locationname.sendKeys(Name);
        Waits.shortPause();
        locationcity.sendKeys(City);
        Waits.shortPause();
        locationprovince.sendKeys(Province);
        Waits.shortPause();
        selectCountry(SelectedCountry);
        Waits.shortPause();
        locationphone.sendKeys(Phone);
        Waits.shortPause();
        locationfax.sendKeys(Fax);
        Waits.shortPause();
        locationaddress.sendKeys(SendAddress);
        Waits.shortPause();
        locationnotes.sendKeys(LocationNotes);
        Waits.shortPause();
        save.click();
    }

    //TODO - Admin search ORG Structure
    private WebElement searchORGStructure(String DeptName) {
        WebElement OrgStructureResults = structureElements.stream().filter(orgresult -> orgresult.getText().contains(DeptName)).findFirst().orElse(null);
        return OrgStructureResults;
    }

    //TODO - Admin change Organization Structure
    public void changeOrganizationStructure(String DeptName, String UnitOperation) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        structure.click();
        Waits.shortPause();
        generaleditcheckbox.click();
        Waits.shortPause();
        OrgResults = searchORGStructure(DeptName);
        Waits.shortPause();
        if (UnitOperation.contains("Delete")) {
            OrgResults.findElement(strDelete).click();
            yesDelete.click();
        } else if (UnitOperation.contains("Edit")) {
            OrgResults.findElement(strEdit).click();

        } else if (UnitOperation.contains("AddUnit")) {
            OrgResults.findElement(strAddUnit).click();
        } else {
            System.out.println("Entered Value is not match");
            Assert.fail("Entered Value is not match");
        }
    }

    //TODO - Admin Add Units Organization Structure
    public void addOrganizationUnit(String UnitID, String UnitName, String UnitDesc) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        structure.click();
        Waits.shortPause();
        generaleditcheckbox.click();
        Waits.shortPause();
        addorganization.click();
        Waits.shortPause();
        addunitid.sendKeys(UnitID);
        Waits.shortPause();
        addunitname.sendKeys(UnitName);
        Waits.shortPause();
        addunitdesc.sendKeys(UnitDesc);
        Waits.shortPause();
        unitsave.click();
    }
}
