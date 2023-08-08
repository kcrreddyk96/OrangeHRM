package OrangeHRM.testCases.adminModule;

import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.*;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Converters.YAMLtoHashMap;
import OrangeHRM.utilities.Waits;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AdminPageTestCases extends Browser {

    //TODO *********************** Admin User Management Page Test ********************************** \\

    @Test(description = "Admin searching by username of user", priority = 0, groups = {"Regression", "Admin", "Admin User"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchByUserName")
    public void adminSearchByUserName(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using username
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByUserName(hashMap.get("SearchUserName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin searching by role of user", priority = 1, groups = {"Regression", "Admin", "Admin User"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchByUserRole")
    public void adminSearchByUserRole(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using UserRole
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByUserRole(hashMap.get("UserRole"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin searching by employer name of employer", priority = 2, groups = {"Regression", "Admin", "Admin User"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchByEmpName")
    public void adminSearchByEmpName(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByEmpName(hashMap.get("EMPName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin searching by Status of user", priority = 3, groups = {"Regression", "Admin", "Admin User"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchByStatus")
    public void adminSearchByStatus(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using Status
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByStatus(hashMap.get("SearchStatus"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin adding user as admin", priority = 4, groups = {"Regression", "Admin", "Admin User"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddAdminUser")
    public void adminAddAdminUser(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Admin page module
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.addAdminUser(hashMap.get("SelectRole"), hashMap.get("EmpName"), hashMap.get("SelectStatus"), hashMap.get("UserName"), hashMap.get("UserPassword"), hashMap.get("ConfirmPassword"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    //TODO *********************** Admin Job Page Test ********************************** \\

    @Test(description = "Admin adding job titles", priority = 5, groups = {"Regression", "Admin", "Admin Job"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddJobTitles")
    public void adminAddJobTitles(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddJobTitles(hashMap.get("JobTitle"), hashMap.get("JobDesc"), hashMap.get("JobNotes"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin adding pay grades", priority = 6, groups = {"Regression", "Admin", "Admin Job"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddPayGrades")
    public void adminAddPayGrades(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddPayGrades(hashMap.get("PayGradeName"), hashMap.get("CurrentCodeINR"), hashMap.get("MinPay"), hashMap.get("MaxPay"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin adding new employment status", priority = 7, groups = {"Regression", "Admin", "Admin Job"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewEmploymentStatus")
    public void adminAddingNewEmploymentStatus(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddingNewEmploymentStatus(hashMap.get("EmploymentName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin adding job categories", priority = 8, groups = {"Regression", "Admin", "Admin Job"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddJobCategories")
    public void adminAddJobCategories(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddJobCategories(hashMap.get("JobCategorieName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin adding work shifts", priority = 9, groups = {"Regression", "Admin", "Admin Job"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddWorkShift")
    public void adminAddWorkShift(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddWorkshift(hashMap.get("ShiftName"), hashMap.get("FromStartHour"), hashMap.get("FromStartMin"), hashMap.get("FromAMPM"), hashMap.get("ToEndHour"), hashMap.get("ToEndMin"), hashMap.get("ToAMPM"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    //TODO *********************** Admin Organization Page Test ********************************** \\

    @Test(description = "Admin Editing General Information Verification", priority = 10, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminEditingGeneralInformationVerification")
    public void adminEditingGeneralInformationVerification(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        dashboardpage.adminModule();
        //TODO - Admin Organization general Information Verification
        AdminOrganization adminorganization = new AdminOrganization(driver);
        adminorganization.accessAndEditGeneralInformation(hashMap.get("GeneralORGName"), hashMap.get("GeneralRegistrationNumber"),
                hashMap.get("GeneralTaxID"), hashMap.get("GeneralPhone"), hashMap.get("GeneralFax"), hashMap.get("GeneralAddress1"),
                hashMap.get("GeneralAddress2"), hashMap.get("GeneralCity"), hashMap.get("GeneralProvince"), hashMap.get("GeneralPostal"),
                hashMap.get("SelectedCountry"), hashMap.get("GeneralNotes"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin searching Location", priority = 11, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchingLocation")
    public void adminSearchingLocation(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminOrganization adminorganization = new AdminOrganization(driver);
        dashboardpage.adminModule();
        adminorganization.searchLocations(hashMap.get("LocationName"), hashMap.get("LocationCity"),hashMap.get("SelectedCountry"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Adding New Location", priority = 12, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingLocation")
    public void adminAddingLocation(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminOrganization adminorganization = new AdminOrganization(driver);
        dashboardpage.adminModule();
        adminorganization.addLocation(hashMap.get("Name"), hashMap.get("City"), hashMap.get("Province"), hashMap.get("SelectedCountry"), hashMap.get("Phone"), hashMap.get("Fax"), hashMap.get("sendAddress"), hashMap.get("LocationNotes"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin ChangingOrganization Structure", priority = 13, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminChangeOrganizationStructure")
    public void adminChangeOrganizationStructure(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminOrganization adminorganization = new AdminOrganization(driver);
        dashboardpage.adminModule();
        adminorganization.changeOrganizationStructure(hashMap.get("DeptName"), hashMap.get("UnitOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Adding Organization Unit", priority = 14, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddOrganizationUnit")
    public void adminAddOrganizationUnit(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminOrganization adminorganization = new AdminOrganization(driver);
        dashboardpage.adminModule();
        adminorganization.addOrganizationUnit(hashMap.get("UnitID"), hashMap.get("UnitName"), hashMap.get("UnitDesc"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }


    //TODO *********************** Admin Qualifications Page Test ********************************** \\
    @Test(description = "Admin searching On Skill", priority = 15, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchingSkillRecords")
    public void adminSearchingSkillRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.setOperationsOnSkill(hashMap.get("SkillName"), hashMap.get("SkillRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Adding New Skill Record", priority = 16, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewSkillsRecord")
    public void adminAddingNewSkillsRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.addNewSkillsRecord(hashMap.get("SkillName"), hashMap.get("SkillDesc"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Searching Education Records", priority = 17, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchingEducationRecords")
    public void adminSearchingEducationRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.setOperationsOnEducation(hashMap.get("Degree"), hashMap.get("EducationRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Adding New Education Record", priority = 18, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewEducationRecord")
    public void adminAddingNewEducationRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.addNewEductationRecord(hashMap.get("EduDegreeName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Searching License Records", priority = 19, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchingLicenseRecords")
    public void adminSearchingLicenseRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.setOperationsOnLicenses(hashMap.get("LicenseName"), hashMap.get("LicenseRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Adding New License Record", priority = 20, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewLicenseRecord")
    public void adminAddingNewLicenseRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.addNewLicenseRecord(hashMap.get("LicenseName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Searching Language Records", priority = 21, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchingLanguageRecords")
    public void adminSearchingLanguageRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.setOperationsOnLanguages(hashMap.get("LanguageName"), hashMap.get("LanguageRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Adding New Language Record", priority = 22, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewLanguageRecord")
    public void adminAddingNewLanguageRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.addNewLanguageRecord(hashMap.get("AddLanguageName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Searching Membership Records", priority = 23, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchingMembershipRecords")
    public void adminSearchingMembershipRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.setOperationsOnMemberships(hashMap.get("MembershipName"), hashMap.get("MembershipDetails"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    @Test(description = "Admin Adding New Membership Record", priority = 24, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewMembershipRecord")
    public void adminAddingNewMembershipRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminQualifications adminqualifications = new AdminQualifications(driver);
        dashboardpage.adminModule();
        adminqualifications.addNewMembershipRecord(hashMap.get("MembershipRecordName"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }


    //TODO *********************** Admin Nationalities Page Test ********************************** \\

    @Test(description = "Admin searching Nationalities Records", priority = 25, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchNationalitiesRecords")
    public void adminSearchNationalitiesRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.setOperationsOnNationalities(hashMap.get("NameOfTheNation"), hashMap.get("NationRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Adding Nationality Records", priority = 26, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminAddingNewNationalitiesRecord")
    public void adminAddingNewNationalitiesRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.addNewNationalitiesRecord(hashMap.get("NameOfTheNation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();

    }

    //TODO *********************** Admin Corporate Branding Page Test ********************************** \\
    @Test(description = "Admin Changing Corporate Branding Details", priority = 27, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminModuleConfiguration")
    public void adminCorporateBranding(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.addCorporateBranding(hashMap.get("PrimaryColorCode"), hashMap.get("SecondaryColorCode"), hashMap.get("PrimaryFontColorCode"), hashMap.get("SecondaryFontColorCode"), hashMap.get("GradientColorCode1"), hashMap.get("GradientColorCode2"), hashMap.get("DisplaySocialMediaYesNo"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    //TODO *********************** Admin Localization Page Test ********************************** \\
    @Test(description = "Admin Changing Localization Configuration Details", priority = 28, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminModuleConfiguration")
    public void adminLocalizationConfiguration(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.localizationconfiguration(hashMap.get("DateFormat"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    //TODO *********************** Admin Language Packages Page Test ********************************** \\
    @Test(description = "Admin Changing Language Package Configuration Details", priority = 29, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminModuleConfiguration")
    public void adminLanguagePackageConfiguration(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.languagepackagesconfiguration(hashMap.get("LanguagePackage"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    //TODO *********************** Admin Module Configuration Packages Page Test ********************************** \\
    @Test(description = "Admin Changing Module Configuration Details", priority = 30, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminModuleConfiguration")
    public void adminModuleConfiguration(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminMore adminmore = new AdminMore(driver);
        adminmore.moduleconfiguration(hashMap.get("menu"), hashMap.get("ShowHide"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }
}
