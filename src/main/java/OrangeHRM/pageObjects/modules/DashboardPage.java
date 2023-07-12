package OrangeHRM.pageObjects.modules;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends GlobalPageObjects {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void dashboardicons(){

    }


}
