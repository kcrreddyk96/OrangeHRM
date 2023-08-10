package OrangeHRM.utilities;

import OrangeHRM.pageObjects.global.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Browser {
    public WebDriver driver;
    public String pageURL;
    String browserName;
    public String USERNAME;
    public String PASSWORD;
    public String ProfileDropdown;

    public WebDriver initializeTheBrowser() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//OrangeHRM//configs//config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException exception caught in initialize method: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException exception caught in initialize method: " + e.getMessage());
        }

        //TODO - To get Browser input form Terminal or config.properties File
        browserName = System.getProperty("web_browser") != null ? System.getProperty("web_browser") : properties.getProperty("web_browser");

        //TODO - To get url input form Terminal or Config.properties File
        pageURL = System.getProperty("webpageURL") != null ? System.getProperty("webpageURL") : properties.getProperty("webpageURL");

        USERNAME = properties.getProperty("UserName");
        PASSWORD = properties.getProperty("UserPassword");
        ProfileDropdown = properties.getProperty("ProfileDropdown");


        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C://Program Files//BraveSoftware//Brave-Browser//Application//brave.exe");
            driver = new ChromeDriver(options);
            System.out.println("Chrome Browser is Selected " + driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Firefox Browser is Selected " + driver);
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Edge Browser is Selected " + driver);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void setLaunchBrowser() throws InterruptedException {
        //TODO - Initializing Browser
        driver = initializeTheBrowser();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getURL(pageURL);
        loginpage.setLogin(USERNAME, PASSWORD);
    }

    @AfterMethod(alwaysRun = true)
    public void setShutdown() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.dashboardModule();
        Waits.shortPause();
        loginpage.profiledropdown("logout");
        Waits.shortPause();
        driver.quit();
    }

    String path = System.getProperty("user.dir") + "//testReports//TestReport.html";
    ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    ExtentReports extentreports = new ExtentReports();

    public ExtentReports getReportObject() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//OrangeHRM//configs//config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException exception caught in initialize method: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException exception caught in initialize method: " + e.getMessage());
        }
        reporter.config().setReportName("Test Automation Report");
        reporter.config().setDocumentTitle("Test Automation Reports");
        reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setCss(".badge-primary{background-color:#ed5045} .badge-success, .pass-bg, .avatar.pass{background-color:#28be3b}");
        reporter.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
        reporter.viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY, ViewName.DEVICE, ViewName.EXCEPTION, ViewName.LOG, ViewName.AUTHOR}).apply();
        extentreports.attachReporter(reporter);
        extentreports.setSystemInfo("Test_Environment ", properties.getProperty("Test_Environment"));
        extentreports.setSystemInfo("Application_Name ", properties.getProperty("Application_Name"));
        extentreports.setSystemInfo("Application_URL ", properties.getProperty("webpageURL"));
        extentreports.setSystemInfo("Browser_Name ", properties.getProperty("web_browser"));
        extentreports.setSystemInfo("Operating_System ", System.getProperty("os.name"));
        extentreports.setSystemInfo("Operating_Architecture ", System.getProperty("os.arch"));
        extentreports.setSystemInfo("Java_Version ", System.getProperty("java.runtime.version"));
        extentreports.setSystemInfo("File_Encoding_Techniques ", System.getProperty("file.encoding"));
        extentreports.setSystemInfo("Tester_Name ", System.getProperty("user.name"));
        //System.getProperties().list(System.out);
        return extentreports;
    }
}
