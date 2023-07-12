package OrangeHRM.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
    static String path = System.getProperty("user.dir") + "//reports//index.html";
    static ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    static ExtentReports extentreports = new ExtentReports();

    public static ExtentReports getReportObject() {
        reporter.config().setReportName("OrangeHRM Automation Report");
        reporter.config().setDocumentTitle("OrangeHRM Automation Reports");
        reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        reporter.config().setTheme(Theme.DARK);
        extentreports.attachReporter(reporter);
        extentreports.attachReporter(reporter);
        extentreports.setSystemInfo("Host", "Local_Host");
        extentreports.setSystemInfo("Application Type", "Web Application");
        extentreports.setSystemInfo("Application Name", "OrangeHRM");
        extentreports.setSystemInfo("System_Environment", "Windows 11");
        extentreports.setSystemInfo("Test_Environment", "Demo");
        extentreports.setSystemInfo("Tester_Name", "KC_Reddy");
        return extentreports;
    }
}
