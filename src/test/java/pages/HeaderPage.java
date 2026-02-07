package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {

    private WebDriver driver;

    private By navBar = By.xpath("//ul[@class='nav navbar-nav']");
    private By homeMenu = By.xpath("//a[normalize-space()='Home']");
    private By productsMenu = By.xpath("//a[@href='/products']");
    private By cartMenu = By.xpath("//a[.=' Cart']");
    private By signUpLoginMenu = By.xpath("//a[@href='/login']");
    private By testCasesMenu = By.xpath("//a[contains(text(),'Test Cases')]");
    private By apiTestingMenu = By.xpath("//a[normalize-space()='API Testing']");
    private By videoTutorialMenu = By.xpath("//a[normalize-space()='Video Tutorials']");
    private By contactUsMenu = By.xpath("//a[@href='/contact_us']");

    private By apiPageHeading = By.xpath("//b[normalize-space()='APIs List for practice']");

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isNavBarDisplayed() {
        return driver.findElement(navBar).isDisplayed();
    }

    public boolean isHomeMenuDislayed() {
        return driver.findElement(homeMenu).isDisplayed();
    }

    public boolean isProductsMenuDisplayed() {
        return driver.findElement(productsMenu).isDisplayed();
    }

    public boolean isCartMenuDisplayed() {
        return driver.findElement(cartMenu).isDisplayed();
    }

    public boolean isSignupLoginMenuDisplayed() {
        return driver.findElement(signUpLoginMenu).isDisplayed();
    }

    public boolean isTestCasesMenuDisplayed() {
        return driver.findElement(testCasesMenu).isDisplayed();
    }

    public boolean isAPITestingMenuDisplayed() {
        return driver.findElement(apiTestingMenu).isDisplayed();
    }

    public boolean isVideoTutorialMenuDisplayed() {
        return driver.findElement(videoTutorialMenu).isDisplayed();
    }

    public boolean isContactUsMenuDisplayed() {
        return driver.findElement(contactUsMenu).isDisplayed();
    }

    public boolean isHomeMenuActiveByDefault() {
        String styleValue = driver.findElement(homeMenu).getAttribute("style");
        return styleValue != null && styleValue.contains("orange");
    }

    public void clickProductsMenu() {
        driver.findElement(productsMenu).click();
    }

    public void clickCartMenu() {
        driver.findElement(cartMenu).click();
    }

    public void clickSignupLoginMenu() {
        driver.findElement(signUpLoginMenu).click();
    }

    public void clickTestCasesMenu() {
        driver.findElement(testCasesMenu).click();
    }

    public void clickApiTestMenu() {
        driver.findElement(apiTestingMenu).click();
    }

    public void clickVideoTutorialsMenu() {
        driver.findElement(videoTutorialMenu).click();
    }

    public void clickContactUsMenu() {
        driver.findElement(contactUsMenu).click();
    }

}


