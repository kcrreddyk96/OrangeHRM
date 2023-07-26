package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminJob;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import OrangeHRM.utilities.YAMLtoHashMapConverter;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AdminJobTest extends Browser {

    @Test(description = "Admin adding job titles", priority = 0, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "adminAddJobTitles")
    public void AddJobTitles(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddJobTitles(hashMap.get("JobTitle"), hashMap.get("JobDesc"), hashMap.get("JobNotes"));
    }

    @Test(description = "Admin adding pay grades", priority = 1, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "adminAddPayGrades")
    public void AddPayGrades(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddPayGrades(hashMap.get("PayGradeName"), hashMap.get("CurrentCodeINR"), hashMap.get("MinPay"), hashMap.get("MaxPay"));
    }

    @Test(description = "Admin adding new employment status", priority = 2, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "adminAddingNewEmploymentStatus")
    public void AddingNewEmploymentStatus(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddingNewEmploymentStatus(hashMap.get("EmploymentName"));
    }

    @Test(description = "Admin adding job categories", priority = 3, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "adminAddJobCategories")
    public void AddJobCategories(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddJobCategories(hashMap.get("JobCategorieName"));
    }

    @Test(description = "Admin adding work shifts", priority = 4, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "adminAddWorkshift")
    public void AddWorkshift(HashMap<String, String> hashMap) throws InterruptedException {
        //TODO - Adding Admin Jobs Section
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddWorkshift(hashMap.get("ShiftName"), hashMap.get("FromStartHour"), hashMap.get("FromStartMin"), hashMap.get("FromAMPM"), hashMap.get("ToEndHour"), hashMap.get("ToEndMin"), hashMap.get("ToAMPM"));
    }
}
