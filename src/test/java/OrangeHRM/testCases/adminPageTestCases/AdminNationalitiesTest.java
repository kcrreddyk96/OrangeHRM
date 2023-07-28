package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminMore;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import OrangeHRM.utilities.YAMLtoHashMapConverter;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AdminNationalitiesTest extends Browser {
    DashboardPage dashboardpage = new DashboardPage(driver);
    AdminMore adminmore = new AdminMore(driver);

    @Test(description = "Admin searching Nationalities Records", priority = 0, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "setOperationsOnNationalities")
    public void SearchNationalitiesRecords(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.setOperationsOnNationalities(hashMap.get("NameOfTheNation"), hashMap.get("NationRecordOperation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }

    @Test(description = "Admin Adding Nationality Records", priority = 1, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "addNewNationalitiesRecord")
    public void AddingNewNationalitiesRecord(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        AdminMore adminmore = new AdminMore(driver);
        dashboardpage.adminModule();
        adminmore.addNewNationalitiesRecord(hashMap.get("NameOfTheNation"));
        Waits.shortPause();
        dashboardpage.dashboardModule();
    }
}
