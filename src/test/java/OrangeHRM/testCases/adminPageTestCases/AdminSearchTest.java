package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import OrangeHRM.utilities.YAMLtoHashMapConverter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AdminSearchTest extends Browser {
    String SearchModule = "Admin";

    @Test(priority = 0, dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "searchByUserName")
    public void searchByUserName(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using username
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByUserName(hashMap.get("SearchUserName"));
    }

    @Test(priority = 1, groups = {"Admin", "Regression"}, dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "searchByUserRole")
    public void searchByUserRole(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using UserRole
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByUserRole(hashMap.get("UserRole"));
    }

    @Test(priority = 2)
    public void searchByEmpName() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByEmpName("Paul  Collings");
    }

    @Test(priority = 3)
    public void searchByStatus() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using Status
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByStatus("Enabled");
    }
}
