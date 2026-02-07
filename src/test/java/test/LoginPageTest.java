package test;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void verifyLoginPageDisplayed() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        Assert.assertTrue(login.isLoginPageDisplayed(), "Login Page Is Not Displayed");
    }

    @Test
    public void verifyLoginFormIsVisible() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        Assert.assertTrue(login.isLoginFormVisible(), "Login Form is not visible");
    }

    @Test
    public void validateFieldLabels() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        Assert.assertEquals(login.getEmailLabelText(), "Email Address", "Email label is incorrect");
        Assert.assertEquals(login.getPasswordLabelText(), "Password", "Password label is incorrect");
    }

    @Test
    public void verifyLoginButtonDisplayed() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        Assert.assertTrue(login.isLoginButtonDisplayed(), "Login Button is not displayed");
    }

    @Test
    public void verifyLoginButtonEnabled() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        Assert.assertTrue(login.isLoginButtonEnabled(), "Login Button is not enabled");
    }

    @Test
    public void verifyLoginWithValidCredentials() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        login.enterEmail("hariii@gmail.com");
        login.enterPassword("XzUu@H5Ahzm3NWD");
        login.clickLoginButton();

        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(.,'Logged in as Harini')]")).isDisplayed(), "User login failed");
    }

    @Test
    public void verifyLoginWithInvalidCredentials() {
        LoginPage login = new LoginPage(driver);

        login.openLoginPage();

        login.enterEmail("wronguser@gmail.com");
        login.enterPassword("1234567890");
        login.clickLoginButton();

        Assert.assertTrue(driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).isDisplayed(), "Error message is not displayed");
    }

}
