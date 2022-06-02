package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
    /**
     * This method will move your view to the given element
     * @param driver is WebDriver
     */

    public static void scrollIntoView(WebDriver driver, WebElement element){
        JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
        jExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * this method will higligh the element backgroung to res color
     * @param driver
     * @param element
     */

    public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //will move into view fiest
        scrollIntoView(driver, element);
        //will highlight the element to red color
        js.executeScript("arguments[0].style.backgroundColor='red'", element);
        Thread.sleep(500);
        //will remove the red highlight

        js.executeScript("arguments[0].style.backgroundColor=''", element);

    }
    //ใช้ สำหรับ wait until visible
    public static void  waitUntilVisible(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}