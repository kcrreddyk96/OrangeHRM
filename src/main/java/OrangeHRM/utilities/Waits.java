package OrangeHRM.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    WebDriver driver;

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToAppear(By findBy) { //TODO - Visibility of Web Element using BY Locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void waitForElementToAppear(WebElement findBy) { //TODO - Visibility of Web Element using WebElement Locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void waitForElementToDisappear(WebElement findBy) { //TODO - invisibility of Web Element using WebElement Locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOf(findBy));
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
