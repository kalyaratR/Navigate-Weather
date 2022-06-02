package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){

        homePage = new HomePage(getDriver());
    }

    @Test(testName = "Popup")
    public void test123() throws InterruptedException {

        homePage.waitForElementVisibility(getDriver().findElement(By.xpath("//div//h2[text()='Your Privacy']")));

        System.out.println(getDriver().findElement(By.xpath("//*[@class='PrivacyDataNotice--mainParagraph--1nQsp']")).getText());
        getDriver().findElement(By.xpath("//*[@class='Icon--icon--3wCKh Icon--actionTheme--sZu_q PrivacyDataNotice--closeButton--1fBzh']")).click();

    }

}
/*
1. Navigate to https://weather.com
2. Wait until pop-up window appears
3. Get the text of the pop-up window and close it
 */

