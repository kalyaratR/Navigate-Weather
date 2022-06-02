package pages;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

import static base.BasePage.switchToNextWindow;
import static utils.SeleniumUtils.scrollIntoView;


public class LoginPage {

    public class FollowingTest extends BaseTest {
        HomePage homePage;

        @BeforeMethod
        public void localSetUp(){

            homePage = new HomePage(getDriver());
        }

        @Test(testName = "Connect Social")
        public void test3456() throws InterruptedException {
            //Close Pop-up
            homePage.waitForElementVisibility(getDriver().findElement(By.xpath("//div//h2[text()='Your Privacy']")));
            getDriver().findElement(By.xpath("//*[@class='Icon--icon--3wCKh Icon--actionTheme--sZu_q PrivacyDataNotice--closeButton--1fBzh']")).click();

            //scroll down to footer

            homePage.moveIntoView(getDriver().findElement(By.xpath("//span[@class='Footer--connect--x2PKn']")));

            //Click to FB TW IG YT
            homePage.waitForElementVisibility(getDriver().findElement(By.xpath("//span[@class='Footer--connect--x2PKn']")));

            List<WebElement> links = getDriver().findElements(By.xpath("//div[@class='Footer--socialLogos--2MwDy']//a"));
            links.forEach(link -> link.click());

            switchToNextWindow(getDriver());
        }

    }
/*
3. close pop-up window
4. Click on following buttons in the bottom of the page:
    facebook
    twitter
    youtube
5. Print out titles of all 3 pages opened above
6. Close 3 windows and return to weather channel window
 */
}
