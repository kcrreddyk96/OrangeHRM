package OrangeHRM.testCases.adminPageTestCases;

import OrangeHRM.pageObjects.modules.DashboardPage;
import OrangeHRM.pageObjects.modules.admin.AdminOrganization;
import OrangeHRM.utilities.Browser;
import org.testng.annotations.Test;

public class AdminOrganizationTest extends Browser {
    public String OrgNote1;
    String OrgNotes = "Orange HRM is CRM Tool, \n" +
            "OrangeHRM provides a scalable HRM solution for small and midsize businesses,\n" +
            "Ensuring the entire employment lifecycle is covered, from onboarding to termination.";

    @Test
    public void generalInformationVerification() throws InterruptedException {
        DashboardPage dashboardpage = new DashboardPage(driver);
        dashboardpage.adminModule();

        //TODO - Admin Organization general Information Verification
        AdminOrganization adminorganization = new AdminOrganization(driver);
        adminorganization.accessAndEditGeneralInformation("ORANGE HRM", "ORG125IND0005",
                "ORG0005", "1234567895", "50051", "1-2-3,Street 05",
                "Hyderabad", "Hyderabad", "Telangana", "500001", "India", OrgNotes);
    }
}