package OrangeHRM.testCases.globalTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.HashMapConverter;
import OrangeHRM.utilities.Waits;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class MultipleLoginValidationTest extends Browser {
    List<HashMap<String, String>> getData;
    HashMapConverter hashmap = new HashMapConverter();

    @BeforeMethod(alwaysRun = true)
    public void setLaunchBrowser() {
        driver = initializeTheBrowser();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getURL(pageURL);
    }

    @Test(description = "Multiple Login Validations Test", dataProvider = "setDataProvider")
    public void LoginWithValidCreditionals(HashMap<String, String> input) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLogin(input.get("userName"), input.get("userPassword"));
        Waits.shortPause();
        loginPage.profiledropdown("logout");
    }

    @AfterMethod
    public void setShutdown() {
        driver.close();
    }

    @DataProvider
    public Object[][] setDataProvider() throws IOException {
        getData = hashmap.getJsonDataToHashMap(System.getProperty("user.dir") + "//src//test//java//OrangeHRM//testData//dataSets.json");
        return new Object[][]{{getData.get(0)}, {getData.get(2)}};
    }
}
