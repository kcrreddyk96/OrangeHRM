package OrangeHRM.testCases.global;

import OrangeHRM.testComponents.BrowserInitialization;
import OrangeHRM.pageObjects.global.HomePage;
import org.testng.annotations.Test;

public class LoginTest extends BrowserInitialization {
     HomePage homepage;
/*

    @Test
    @Parameters({"UserName", "UserPassword"})
    public void loginValidationTest(String UserName, String UserPassword) {
        homepage = loginpage.setLogin(UserName, UserPassword);
    }
*/

    @Test
    public void loginValidationTest() {
        homepage = loginpage.setLogin("Admin", "admin123");
    }
}
