package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.global.LoginPage;
import OrangeHRM.pageObjects.modules.admin.AdminJob;
import OrangeHRM.pageObjects.modules.admin.AdminPage;
import OrangeHRM.utilities.Browser;
import OrangeHRM.utilities.Waits;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminModuleTest extends Browser {
    String SearchModule = "Admin";
    String JobTitle = "Software Quality Test Engineer";
    String JD = "We are currently seeking a Software Test Engineer with a strong manual testing background who has understanding of SQL and basic scripting knowledge to work closely with our Development and QA teams in Chicago or Naperville office.\n"
            + " This person will sit in our Integration team and is responsible for testing the Fieldglass application in order to maintain product quality.\n";
    String JN = "Working if not extensive knowledge of Selenium, SOAP UI, and XML\n" +
            "Basic scripting knowledge such as VBS or similar\n" +
            "Experience with building an automation framework from scratch\n" +
            "Ability to thrive in a fast paced start-up environment";

    @Test(priority = 0, groups = { "Admin", "Regression"})
    public void AddAdminUser() throws InterruptedException {
        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Admin page module
        AdminPage adminpage = new AdminPage(driver);
        adminpage.addAdminUser("Admin", "pa", "Enabled", "admin", "admin123", "admin123");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown(ProfileDropdown);
    }

    @Test(priority = 1, groups = { "Admin", "Regression"})
    public void AddJobTitles() throws InterruptedException {
        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddJobTitles(JobTitle, JD, JN);

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown(ProfileDropdown);
    }

    @Test(priority = 2, groups = { "Admin", "Regression"})
    public void AddPayGrades() throws InterruptedException {
        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddPayGrades("Sal", "INR", "2500", "5000");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown(ProfileDropdown);
    }

    @Test(priority = 3, groups = { "Admin", "Regression"})
    public void AddingNewEmploymentStatus() throws InterruptedException {
        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddingNewEmploymentStatus("Long Term Role");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown(ProfileDropdown);
    }

    @Test(priority = 4, groups = { "Admin", "Regression"})
    public void AddJobCategories() throws InterruptedException {
        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddJobCategories("IT");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown(ProfileDropdown);
    }

    @Test(priority = 5, groups = { "Admin", "Regression"})
    public void AddWorkshift() throws InterruptedException {
        //TODO - Login page module
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        Waits.shortPause();
        loginpage.setLogin(USERNAME, PASSWORD);
        loginpage.setSearch(SearchModule);

        //TODO - Adding Admin Jobs Section
        AdminJob adminjob = new AdminJob(driver);
        adminjob.adminAddWorkshift("Day Shift", "10", "00", "AM", "05", "30", "PM");

        // TODO - Logout
        Waits.longPause();
        loginpage.profiledropdown(ProfileDropdown);
    }
}
