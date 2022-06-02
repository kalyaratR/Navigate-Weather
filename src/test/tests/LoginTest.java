package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest {

    public class WeatherDay extends BaseTest {
        HomePage homePage;

        @BeforeMethod
        public void localSetUp(){

            homePage = new HomePage(getDriver());
        }

        @Test(testName = "10 Day")
        public void test7(){

            //Click 10Day
            getDriver().findElement(By.xpath("//span[text()='10 Day']")).click();

        }
    }

/*
7. Click to "10 Day" button and print out following:
    Day - High/Low - Description
    Today - 92/73 - Scattered Thunderstorms
 */

}
