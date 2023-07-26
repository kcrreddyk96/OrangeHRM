package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AdminQualifications extends GlobalPageObjects {
    WebDriver driver;
    WebElement skillsetresult;

    WebElement SkillRecords;

    public AdminQualifications(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //TODO - Admin Qualifications Page Object Elements
    @FindBy(xpath = "//span[normalize-space()='Qualifications']")
    private WebElement qualifications;

    @FindBy(xpath = "//a[normalize-space()='Skills']")
    private WebElement skills;

    @FindBy(xpath = "//a[normalize-space()='Education']")
    private WebElement education;

    @FindBy(xpath = "//a[normalize-space()='Licenses']")
    private WebElement licenses;

    @FindBy(xpath = "//a[normalize-space()='Languages']")
    private WebElement languages;

    @FindBy(xpath = "//a[normalize-space()='Memberships']")
    private WebElement memberships;

    @FindBy(xpath = "//*[normalize-space()='Add']")
    private WebElement add;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement save;

    @FindBy(css = ".oxd-button--ghost")
    private WebElement cancel;

    By delete = By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]");

    By edit = By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]");

    //TODO - Admin Qualifications Skills Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border' and @role='row']")
    private List<WebElement> skillsrecords;

    //TODO - Admin Qualifications Skills Add Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement skillname;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    private WebElement skilldesc;


    //TODO - Admin Qualifications Education Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border']")
    private List<WebElement> educationrecords;

    //TODO - Admin Qualifications Education Add Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[2]/input")
    private WebElement educationlevel;

    //TODO - Admin Qualifications Licenses Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> licensesrecords;

    //TODO - Admin Qualifications Licenses Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement licensename;

    //TODO - Admin Qualifications Languages Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> languagesrecords;

    //TODO - Admin Qualifications Languages Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement languagename;

    //TODO - Admin Qualifications Memberships Page Object Elements
    @FindBy(css = ".oxd-table-row--with-border")
    private List<WebElement> membershipsrecords;

    //TODO - Admin Qualifications Memberships Page Object Elements
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    private WebElement membershipname;

    //TODO - Admin Qualifications Skills Page Method
    private WebElement skillsRecordsSearch(String SkillName) {
        skillsetresult = skillsrecords.stream().filter(skills ->
                skills.getText().contains(SkillName)).findFirst().orElse(null);
        System.out.println(skillsetresult);
        return skillsetresult;
    }

    public void setOperationsOnSkill(String SkillName, String SkillRecordOperation) throws InterruptedException {
        qualifications.click();
        skills.click();
        Waits.shortPause();
        SkillRecords = skillsRecordsSearch(SkillName);

        if (SkillRecordOperation.equalsIgnoreCase("Delete")) {
            SkillRecords.findElement(delete).click();
        } else if (SkillRecordOperation.equalsIgnoreCase("Edit")) {
            SkillRecords.findElement(edit).click();
        } else {
            System.out.println("Entered Value is not match in the Skill Records Operation");
            Assert.fail("Entered Value is not match in the Skill Records Operation");
        }
    }

    //TODO - Admin Qualifications Add New Skills Record Page Method
    public void addNewSkillsRecord(String SkillName, String SkillDesc) throws InterruptedException {
        qualifications.click();
        skills.click();
        Waits.shortPause();
        add.click();
        Waits.shortPause();
        skillname.sendKeys(SkillName);
        skilldesc.sendKeys(SkillDesc);
        Waits.shortPause();
        save.click();
    }

    //TODO - Admin Qualifications Education Page Method
    private WebElement educationRecordsSearch(String Degree) {
        WebElement eduRecords = educationrecords.stream().filter(edu ->
                edu.getText().contains(Degree)).findFirst().orElse(null);
        System.out.println(eduRecords);
        return eduRecords;
    }

    //TODO - Admin Qualifications Searching Education Degree Record Page Method
    public void setOperationsOnEducation(String Degree, String EducationRecordOperation) {
        qualifications.click();
        education.click();
        WebElement EducationRecords = educationRecordsSearch(Degree);
        if (EducationRecordOperation.equalsIgnoreCase("Delete")) {
            EducationRecords.findElement(delete).click();
        } else if (EducationRecordOperation.equalsIgnoreCase("Edit")) {
            EducationRecords.findElement(edit).click();
        } else {
            System.out.println("Entered Value is not match in the Education Records Operation");
            Assert.fail("Entered Value is not match in the Education Records Operation");
        }
    }

    //TODO - Admin Qualifications Add New Education Degree Record Page Method
    public void addNewEductationRecord(String EduDegreeName) throws InterruptedException {
        qualifications.click();
        education.click();
        add.click();
        Waits.shortPause();
        educationlevel.sendKeys(EduDegreeName);
        save.click();
    }

    //TODO - Admin Qualifications License Record Page Method
    private WebElement licenseRecordsSearch(String LicenseName) {
        WebElement LicenseRecordData = licensesrecords.stream().filter(licensedata ->
                licensedata.getText().equalsIgnoreCase(LicenseName)).findFirst().orElse(null);
        System.out.println(LicenseRecordData);
        return LicenseRecordData;
    }

    public void setOperationsOnLicenses(String LicenseName, String LicenseRecordOperation) throws InterruptedException {
        qualifications.click();
        licenses.click();
        Waits.shortPause();
        WebElement LicenseRecord = licenseRecordsSearch(LicenseName);
        if (LicenseRecordOperation.equalsIgnoreCase("Delete")) {
            LicenseRecord.findElement(delete).click();
        } else if (LicenseRecordOperation.equalsIgnoreCase("Edit")) {
            LicenseRecord.findElement(edit).click();
        } else {
            System.out.println("Entered Value is not match in the License Records Operation");
            Assert.fail("Entered Value is not match in the License Records Operation");
        }
    }

    //TODO - Admin Qualifications Add New License Record Page Method
    public void addNewLicenseRecord(String LicensedName) throws InterruptedException {
        qualifications.click();
        licenses.click();
        add.click();
        Waits.shortPause();
        licensename.sendKeys(LicensedName);
        save.click();
    }

    //TODO - Admin Qualifications Language Record Page Method
    private WebElement languageRecordsSearch(String LanguageName) {
        WebElement LanguageRecordData = languagesrecords.stream().filter(lang ->
                lang.getText().equalsIgnoreCase(LanguageName)).findFirst().orElse(null);
        System.out.println(LanguageRecordData);
        return LanguageRecordData;
    }

    public void setOperationsOnLanguages(String LanguageName, String LanguageRecordOperation) {
        qualifications.click();
        languages.click();
        WebElement LanguageRecords = languageRecordsSearch(LanguageName);
        if (LanguageRecordOperation.equalsIgnoreCase("Delete")) {
            LanguageRecords.findElement(delete).click();
        } else if (LanguageRecordOperation.equalsIgnoreCase("Edit")) {
            LanguageRecords.findElement(edit).click();
        } else {
            System.out.println("Entered Value is not match in the Language Records Operation");
            Assert.fail("Entered Value is not match in the Language Records Operation");
        }
    }

    //TODO - Admin Qualifications Add New Language Record Page Method
    public void addNewLanguageRecord(String AddLanguageName) throws InterruptedException {
        qualifications.click();
        languages.click();
        add.click();
        Waits.shortPause();
        languagename.sendKeys(AddLanguageName);
        save.click();
    }

    //TODO - Admin Qualifications Membership Record Page Method
    private WebElement membershipRecordsSearch(String MembershipName) {
        WebElement MembershipRecordsData = membershipsrecords.stream().filter(member ->
                member.getText().equalsIgnoreCase(MembershipName)).findFirst().orElse(null);
        System.out.println(MembershipRecordsData);
        return MembershipRecordsData;
    }

    public void setOperationsOnMemberships(String MembershipName, String MembershipDetails) {
        qualifications.click();
        memberships.click();
        WebElement MembershipRecords = membershipRecordsSearch(MembershipName);
        if (MembershipDetails.equalsIgnoreCase("Delete")) {
            MembershipRecords.findElement(delete).click();
        } else if (MembershipDetails.equalsIgnoreCase("Edit")) {
            MembershipRecords.findElement(edit).click();
        } else {
            System.out.println("Entered Value is not match in the Membership Records Operation");
            Assert.fail("Entered Value is not match in the Membership Records Operation");
        }
    }

    //TODO - Admin Qualifications Add New Membership Record Page Method
    public void addNewMembershipRecord(String NameOfMembership) throws InterruptedException {
        qualifications.click();
        memberships.click();
        add.click();
        Waits.shortPause();
        membershipname.sendKeys(NameOfMembership);
        save.click();
    }
}
