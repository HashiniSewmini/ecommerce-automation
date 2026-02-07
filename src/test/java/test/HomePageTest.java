package test;

import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void verifyHomePageLoad() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isHomePageLoaded(), "Home page did not load successfully");
    }

    @Test(priority = 2)
    public void verifyHomePageURL() {
        HomePage homePage = new HomePage(driver);

        Assert.assertEquals(homePage.getHomePageUrl(),"https://automationexercise.com/", "Home Page URL is incorrect");
    }

    @Test(priority = 3)
    public void verifyHomePageTitle() {
        HomePage homePage = new HomePage(driver);

        Assert.assertEquals(homePage.getHomePageTitle(), "Automation Exercise");
    }

    @Test(priority = 4)
    public void verifyLogoIsDisplayed() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isLogoDisplayed());
    }

    @Test(priority = 5)
    public void verifyBannerIsDisplayed() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isBannerSectionDisplayed(), "Home page banner section is not displayed");

        Assert.assertTrue(homePage.isBannerHeaderDisplayed(), "Home page banner header is not dispayed");

        Assert.assertTrue(homePage.isBannerDescriptionDisplayed(), "Home page banner description is not displayed");
    }

    @Test(priority = 16)
    public void verifyTestCasesButtonIsDisplayed() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isTestCasesButtonDisplayed(), "Test Cases button is not displayed");
    }

    @Test(priority = 17)
    public void verifyTestCaseButtonIsEnabled() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isTestCasesButtonEnabled(), "Test Cases button is not Enabled");
    }

    @Test(priority = 18)
    public void verifyTestCasesButtonNavigation() {
        HomePage homePage = new HomePage(driver);

        homePage.clickTestCasesButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("test_cases"));

        Assert.assertTrue(driver.getCurrentUrl().contains("test_cases"), "Test Cases page was mot opened");
    }

    @Test(priority = 19)
    public void verifyApiListButtonIsDisplayed() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isApiListButtonDisplayed(), "API List Button is not Displayed");
    }

    @Test(priority = 20)
    public void verifyApiListButtonIsEnabled() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isApiListButtonEnabled(), "API List Button is not Enabled");
    }

    @Test(priority = 21)
    public void verifyApiListButtonNavigation() {
        HomePage homePage = new HomePage(driver);

        homePage.clickApiListButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("api_list"), "API List page was not opened");
    }


}