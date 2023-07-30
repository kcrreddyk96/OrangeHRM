package OrangeHRM.testCases.globalTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Converters.JSONtoHashMap;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginLogoutTest extends Browser {
    /*

        @Test
        @Parameters({"UserName", "UserPassword"})
        public void loginValidationTest(String UserName, String UserPassword) {
            homepage = loginpage.setLogin(UserName, UserPassword);
        }
    */
    @Override
    @BeforeMethod(alwaysRun = true)
    public void setLaunchBrowser() {
        driver = initializeTheBrowser();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getURL(pageURL);
    }

    @Test(description = "Login Validation Test", priority = 0, groups = {"Regression", "Login Validation"},
            dataProviderClass = JSONtoHashMap.class, dataProvider = "loginLogoutValidationTest")
    public void loginLogoutValidationTest(HashMap<String, String> hashMap) throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.setLogin(hashMap.get("userName"), hashMap.get("userPassword"));
        loginpage.profiledropdown(hashMap.get("ProfileDropdown"));
    }

    @Override
    @AfterMethod
    public void setShutdown() {
        driver.close();
    }

}
