package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminUserManagement;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import OrangeHRM.utilities.YAMLtoHashMapConverter;
import org.testng.annotations.Test;

import java.util.HashMap;

public class AdminUserManagementTest extends Browser {
    String SearchModule = "Admin";

    @Test(description = "Admin searching by username of user", priority = 0, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "searchByUserRole")
    public void searchByUserName(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using username
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByUserName(hashMap.get("SearchUserName"));
    }

    @Test(description = "Admin searching by role of user", priority = 1, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "searchByUserRole")
    public void searchByUserRole(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using UserRole
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByUserRole(hashMap.get("UserRole"));
    }

    @Test(description = "Admin searching by employer name of user", priority = 2, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "searchByUserRole")
    public void searchByEmpName() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByEmpName("Paul  Collings");
    }

    @Test(description = "Admin searching by Status of user", priority = 3, groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "addAdminUser")
    public void searchByStatus() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Search using Status
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.searchByStatus("Enabled");
    }

    @Test(description = "Admin adding user as admin", groups = {"Admin", "Regression"},
            dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "addAdminUser")
    public void AddAdminUser(HashMap<String, String> hashMap) throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        Waits.pause();
        dashboardpage.adminModule();
        Waits.pause();
        //TODO - Admin page module
        AdminUserManagement adminpage = new AdminUserManagement(driver);
        adminpage.addAdminUser(hashMap.get("SelectRole"), hashMap.get("EmpName"), hashMap.get("SelectStatus"), hashMap.get("UserName"), hashMap.get("UserPassword"), hashMap.get("ConfirmPassword"));
    }
}
