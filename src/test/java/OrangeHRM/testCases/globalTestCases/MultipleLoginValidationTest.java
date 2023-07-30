package OrangeHRM.testCases.globalTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Converters.JSONtoHashMap;
import OrangeHRM.utilities.Waits;
import org.testng.annotations.*;

import java.util.HashMap;

public class MultipleLoginValidationTest extends Browser {
    @BeforeMethod(alwaysRun = true)
    public void setLaunchBrowser() {
        driver = initializeTheBrowser();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getURL(pageURL);
    }

    @Test(description = "Login Validation Test", priority = 0, groups = {"Regression", "Login Validation"},
            dataProviderClass = JSONtoHashMap.class, dataProvider = "MultipleLoginLogoutValidationTest")
    public void MultipleLoginLogoutValidationTest(HashMap<String, String> hashMap) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLogin(hashMap.get("userName"), hashMap.get("userPassword"));
        Waits.shortPause();
        loginPage.profiledropdown(hashMap.get("ProfileDropdown"));
    }

    @AfterMethod
    public void setShutdown() {
        driver.close();
    }

}
