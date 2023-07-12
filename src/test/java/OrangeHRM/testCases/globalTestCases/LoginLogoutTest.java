package OrangeHRM.testCases.globalTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginLogoutTest extends Browser {

    public WebDriver driver;

    @Test
    public void loginrun() throws InterruptedException {
        //TODO - Initializing Browser
        driver = initializeTheBrowser();

        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin("admin", "admin123");
        loginpage.setSearch("ad");
        Waits.longPause();
        loginpage.profiledropdown("logout");
    }
}
