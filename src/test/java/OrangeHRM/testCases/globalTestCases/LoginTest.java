package OrangeHRM.testCases.globalTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.pageObjects.modules.admin.AdminUserManagement;
import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.YAMLtoHashMapConverter;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginTest extends Browser {

    LoginPage loginpage = new LoginPage(driver);
    DashboardPage dashboardpage = new DashboardPage(driver);
    AdminUserManagement adminpage = new AdminUserManagement(driver);


/*

    @Test
    @Parameters({"UserName", "UserPassword"})
    public void loginValidationTest(String UserName, String UserPassword) {
        homepage = loginpage.setLogin(UserName, UserPassword);
    }
*/

    @Test(dataProviderClass = YAMLtoHashMapConverter.class, dataProvider = "yamlDataProvider")
    public void loginLogoutValidationTest(HashMap<String,String>hashMap) throws InterruptedException {
        loginpage.setLogin(hashMap.get("userName"),hashMap.get("userPassword"));
        /*dashboardpage.closeBugerIcon();
        dashboardpage.openBugerIcon();
        dashboardpage.setSearch("admin");
        adminpage.addAdminUser("Admin", "akane", "Enabled", "akane", "admin123", "admin123");
       */
        adminpage.profiledropdown(hashMap.get("logout"));

    }

}
