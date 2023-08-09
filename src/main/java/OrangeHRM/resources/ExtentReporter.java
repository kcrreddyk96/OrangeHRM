package OrangeHRM.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExtentReporter {
    static String path = System.getProperty("user.dir") + "//testReports//testReport.html";
    static ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    static ExtentReports extentreports = new ExtentReports();

    public static ExtentReports getReportObject() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//OrangeHRM//configs//systemConfig.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException exception caught in initialize method: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException exception caught in initialize method: " + e.getMessage());
        }
        String host = properties.getProperty("Host");
        String application_Type = properties.getProperty("Application_Type");
        String application_Name = properties.getProperty("Application_Name");
        String system_Platform = properties.getProperty("System_Platform");
        String platform_Architecture = properties.getProperty("Platform_Architecture");
        String test_Environment = properties.getProperty("Test_Environment");
        String browser_Name = properties.getProperty("Browser_Name");
        String browser_Version = properties.getProperty("Browser_Version");
        String tester_Name = properties.getProperty("Tester_Name");

        reporter.config().setReportName("OrangeHRM Automation Report");
        reporter.config().setDocumentTitle("OrangeHRM Automation Reports");
        reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        reporter.config().setTheme(Theme.DARK);
        extentreports.attachReporter(reporter);
        extentreports.attachReporter(reporter);
        extentreports.setSystemInfo("Host", host);
        extentreports.setSystemInfo("Application_Type", application_Type);
        extentreports.setSystemInfo("Application_Name", application_Name);
        extentreports.setSystemInfo("System_Platform", system_Platform);
        extentreports.setSystemInfo("Platform_Architecture", platform_Architecture);
        extentreports.setSystemInfo("Test_Environment", test_Environment);
        extentreports.setSystemInfo("Browser_Name", browser_Name);
        extentreports.setSystemInfo("Browser_Version", browser_Version);
        extentreports.setSystemInfo("Tester_Name", tester_Name);
        return extentreports;
    }
}
