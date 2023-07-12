package OrangeHRM.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    static WebDriver driver;

    public Waits(WebDriver driver) {
        Waits.driver = driver;
    }

    public static void pause() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void shortPause() throws InterruptedException {
        Thread.sleep(500);
    }

    public static void longPause() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void hold() throws InterruptedException {
        Thread.sleep(1500);
    }
}
