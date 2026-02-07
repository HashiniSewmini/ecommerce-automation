package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By logo = By.xpath("//img[@alt='Website for automation practice']");
    private By bannerSection = By.id("slider");
    private By bannerHeading = By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");
    private By bannerDescription = By.xpath("//div[@class='item active']//p[contains(text(),'All QA engineers can use this website for automati')]");
    private By testCasesButton = By.xpath("//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']");
    private By apiListButton = By.xpath("//div[@class='item active']//button[@type='button'][normalize-space()='APIs list for practice']");
    private By apiPageHeading = By.xpath("//b[normalize-space()='APIs List for practice']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageLoaded() {
        return driver.findElement(logo).isDisplayed();
    }

    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public boolean isLogoDisplayed() {
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isBannerSectionDisplayed() {
        return driver.findElement(bannerSection).isDisplayed();
    }

    public boolean isBannerHeaderDisplayed() {
        return driver.findElement(bannerHeading).isDisplayed();
    }

    public boolean isBannerDescriptionDisplayed() {
        return driver.findElement(bannerDescription).isDisplayed();
    }

    public boolean isTestCasesButtonDisplayed() {
        return driver.findElement(testCasesButton).isDisplayed();
    }

    public boolean isTestCasesButtonEnabled() {
        return driver.findElement(testCasesButton).isEnabled();
    }

    public void clickTestCasesButton() {
        driver.findElement(testCasesButton).click();
    }

    public boolean isApiListButtonDisplayed() {
        return driver.findElement(apiListButton).isDisplayed();
    }

    public boolean isApiListButtonEnabled() {
        return driver.findElement(apiListButton).isEnabled();
    }

    public void clickApiListButton() {
        driver.findElement(apiListButton).click();
    }
}
