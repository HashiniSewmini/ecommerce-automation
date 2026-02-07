package test;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;

import java.time.Duration;

public class HeaderPageTest extends BaseTest {

    @Test(priority = 6)
    public void verifyNavBarDisplayed() {
        HeaderPage headerPage = new HeaderPage(driver);

        Assert.assertTrue(headerPage.isNavBarDisplayed(), "Nav bar not displayed in Home Page");
    }

    @Test(priority = 7)
    public void verifyAllNavBarMenuVisible() {
        HeaderPage headerPage = new HeaderPage(driver);

        Assert.assertTrue(headerPage.isHomeMenuDislayed(), "Nav Bar Home Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isProductsMenuDisplayed(), "Nav Bar Products Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isCartMenuDisplayed(), "Nav Bar Cart Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isSignupLoginMenuDisplayed(), "Nav Bar Signup Login Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isTestCasesMenuDisplayed(), "Nav Bar Test Cases Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isAPITestingMenuDisplayed(), "Nav Bar API Testing Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isVideoTutorialMenuDisplayed(), "Nav Bar Video Tutorials Menu Is Not Displayed.");
        Assert.assertTrue(headerPage.isContactUsMenuDisplayed(), "Nav Bar Contact Us Menu Is Not Displayed.");
    }

    @Test(priority = 8)
    public void verifyHomeMenuIsActiveByDefault() {
        HeaderPage headerPage = new HeaderPage(driver);

        Assert.assertTrue(headerPage.isHomeMenuActiveByDefault(), "Home Menu Is Not Active By Default.");
    }

    @Test(priority = 9)
    public void verifyProductsMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickProductsMenu();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='All Products']")));

        Assert.assertTrue(heading.isDisplayed(), "Products Page is not displayed");
    }

    @Test(priority = 10)
    public void verifyCartMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickCartMenu();

        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
    }

    @Test(priority = 11)
    public void verifySignupLoginMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickSignupLoginMenu();

        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }

    @Test(priority = 12)
    public void verifyTestCasesMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickTestCasesMenu();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("test_cases"));

        Assert.assertTrue(driver.getCurrentUrl().contains("test_cases"));
    }

    @Test(priority = 13)
    public void verifyApiTestingMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickApiTestMenu();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[normalize-space()='APIs List for practice']")));

        Assert.assertTrue(heading.isDisplayed(), "API PageIs Not Displayed");
    }

    @Test(priority = 14)
    public void verifyVideoTutorialsMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickVideoTutorialsMenu();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.youtube.com/c/AutomationExercise"));
    }

    @Test(priority = 15)
    public void verifyContactUsMenuNavigation() {
        HeaderPage header = new HeaderPage(driver);

        header.clickContactUsMenu();

        Assert.assertTrue(driver.getCurrentUrl().contains("contact_us"));
    }

}
