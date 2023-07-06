package OrangeHRM.testComponents;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.utilities.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BrowserInitialization extends Browser {
    //TODO - Initializing the Browser
    public LoginPage loginpage;
    @BeforeMethod(alwaysRun = true)
    public LoginPage launchBrowser() throws IOException {
        driver = initializeTheBrowser();

        //TODO - Calling Next Page Class Object
         loginpage = new LoginPage(driver);

        //TODO - Sending URL to load in the Browser
        loginpage.getURL(pageURL);
        return loginpage;
    }

    @AfterMethod(alwaysRun = true)
    public void setShutdown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
