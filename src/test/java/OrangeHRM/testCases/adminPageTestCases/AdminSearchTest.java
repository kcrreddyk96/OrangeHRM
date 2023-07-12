package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
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

        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Search using username
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByUserName("pa");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown("logout");
    }

    @Test(priority = 1, groups = { "Admin", "Regression"})
    public void searchByUserRole() throws InterruptedException {

        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Search using UserRole
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByUserRole(SearchModule);

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown("logout");
    }

    @Test(priority = 2)
    public void searchByEmpName() throws InterruptedException {

        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Search using EMP Name
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByEmpName("Paul  Collings");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown("logout");
    }

    @Test(priority = 3)
    public void searchByStatus() throws InterruptedException {

        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Search using Status
        AdminPage adminpage = new AdminPage(driver);
        adminpage.searchByStatus("Enabled");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown("logout");
    }
}
