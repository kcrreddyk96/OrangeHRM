package OrangeHRM.testCases.adminModule;

import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminJob;
import OrangeHRM.pageObjects.modules.admin.AdminMore;
import OrangeHRM.pageObjects.modules.admin.AdminOrganization;
import OrangeHRM.pageObjects.modules.admin.AdminUserManagement;
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
    }

    //TODO *********************** Admin Qualifications Page Test ********************************** \\


    //TODO *********************** Admin Nationalities Page Test ********************************** \\

    @Test(description = "Admin searching Nationalities Records", priority = 11, groups = {"Regression", "Admin", "Admin Nationalities"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminSearchNationalitiesRecords")
    public void adminSearchNationalitiesRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.setOperationsOnNationalities(hashMap.get("NameOfTheNation"), hashMap.get("NationRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Adding Nationality Records", priority = 12, groups = {"Regression", "Admin", "Admin Nationalities"},
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

    //TODO *********************** Admin Corporate Branding Page Test ********************************** \\


    //TODO *********************** Admin Configuration Page Test ********************************** \\
    @Test(description = "Admin Changing Module Configuration Details", priority = 13, groups = {"Regression", "Admin", "Admin Organization"},
            dataProviderClass = YAMLtoHashMap.class, dataProvider = "adminModuleConfiguration")
    public void adminModuleConfiguration(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminMore adminmore = new AdminMore(driver);
        adminmore.moduleconfiguration(hashMap.get("menu"), hashMap.get("ShowHide"));
    }
}
