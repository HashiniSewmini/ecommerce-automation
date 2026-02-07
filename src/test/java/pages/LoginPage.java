package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    private WebDriver driver;

    private By signUpLoginMenu = By.xpath("//a[@href='/login']");
    private By loginHeading = By.xpath("//h2[normalize-space()='Login to your account']");
    private By loginForm = By.xpath("//div[@class='login-form']");
    private By loginEmail = By.xpath("//input[@data-qa='login-email']");
    private By loginPassword = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.findElement(signUpLoginMenu).click();
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginHeading).isDisplayed();
    }

    public boolean isLoginFormVisible() {
        return driver.findElement(loginForm).isDisplayed();
    }

    public String getEmailLabelText() {
        return driver.findElement(loginEmail).getAttribute("placeholder");
    }

    public String getPasswordLabelText() {
        return driver.findElement(loginPassword).getAttribute("placeholder");
    }

    public boolean isLoginButtonDisplayed() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public void enterEmail(String email) {
        driver.findElement(loginEmail).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
