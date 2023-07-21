package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminSearchTest extends Browser {
    String SearchModule = "Admin";

    @Test(priority = 0)
    public void searchByUserName() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using username
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByUserName("pa");
    }

    @Test(priority = 1, groups = {"Admin", "Regression"})
    public void searchByUserRole() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using UserRole
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByUserRole(SearchModule);
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
