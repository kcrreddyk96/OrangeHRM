package OrangeHRM.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
    public void scrollToElement(WebElement element, WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDown(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void scrollUp(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
    }

    public void shortScrollDown(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,150)");
    }

    public void ShortScrollUp(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-150)");
    }

    public void longScrollDown(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
    }

    public void longScrollUp(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1000)");
    }
}
