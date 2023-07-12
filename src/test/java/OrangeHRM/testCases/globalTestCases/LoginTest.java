package OrangeHRM.testCases.globalTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.pageObjects.modules.admin.AdminPage;
import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.utilities.Browser;
import org.testng.annotations.Test;

public class LoginTest extends Browser {

    LoginPage loginpage = new LoginPage(driver);
    DashboardPage dashboardpage = new DashboardPage(driver);
    AdminPage adminpage = new AdminPage(driver);


/*

    @Test
    @Parameters({"UserName", "UserPassword"})
    public void loginValidationTest(String UserName, String UserPassword) {
        homepage = loginpage.setLogin(UserName, UserPassword);
    }
*/

    @Test
    public void loginLogoutValidationTest() throws InterruptedException {
        loginpage.setLogin("Admin", "admin123");
        dashboardpage.closeBugerIcon();
        dashboardpage.openBugerIcon();
        dashboardpage.setSearch("admin");
        adminpage.addAdminUser("Admin", "akane", "Enabled", "akane", "admin123", "admin123");
        dashboardpage.profiledropdown("logout1");

    }

}
