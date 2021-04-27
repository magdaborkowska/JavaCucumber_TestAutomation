package pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.asos.com/";
    private static final Logger logger = LogManager.getLogger(HomePage.class.getSimpleName());

    @FindBy(xpath = "//*[@type='button' and @data-testid='myAccountIcon']")
    public WebElement usersAccountButton;

    @FindBy(xpath = "//*[@data-testid='signin-link' and text()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@data-testid='miniBagIcon' and @aria-label='Bag 0 items']")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@class='empty-bag-title' and text()='Your bag is empty']")
    public WebElement textOnPage;

    @FindBy(xpath = "//*[text()='SHOP WOMEN']")
    public WebElement shopWomanButton;

    @FindBy(xpath = "//*[@href='https://www.asos.com/women/new-in/new-in-shoes/cat/?cid=6992&nlid=ww|new+in|new+products|shoes']")
    public WebElement pickCategory;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchField;



    public HomePage(WebDriver driver){
        super(driver);
    }

    @Step("Navigate to home page")
    public HomePage open() {
        openWebPage(HOME_PAGE_URL);
        return this;
    }

    public HomePage clickOnTheCartButton() {
        logger.info("Click on the cart button");
        cartButton.click();
        return this;
    }
    public HomePage clickOnTheShopWomanButton() {
        logger.info("Click on the Shop Woman button");
        shopWomanButton.click();
        return this;
    }
    public HomePage searchTerm(String searchTerm) {
        enterTextIntoField(searchField, searchTerm);
        pressKey(Keys.ENTER);
        return this;
    }


//    @Step("Search for...")
//    public HomePage searchFor(String searchPhrase) {
//        enterTextIntoField(SEARCH_FIELD, searchPhrase);
//        pressKey(Keys.ENTER);
//        return this;
//    }
//
//    @Step("Navigate to Polish version")
//    public HomePage navigateToPolishVersion() {
//        scrollTo(driver, SITE_SELECTION_TAB);
//        clickOnElement(waitToBeClickable(SITE_SELECTION_TAB, driver));
//        clickOnElement(waitToBeClickable(POLAND_BUTTON, driver));
//        return this;
//    }
//
//    @Step("Open My eBay section")
//    public HomePage openMyEbaySection() {
//        mouseOverElement(MY_EBAY_SECTION_BUTTON);
//        return this;
//    }
//
//    @Step("Go to cart")
//    public HomePage goToCart() {
//        clickOnElement(waitToBeClickable(CART_BUTTON, driver));
//        return this;
//    }
//
//    @Step("Navigate to login page")
//    public HomePage navigateToLoginPage() {
//        clickOnElement(waitToBeClickable(MY_EBAY_SECTION_BUTTON, driver));
//        return this;
//    }
//
//    @Step("Navigate to UK version")
//    public HomePage navigateToUKVersion() {
//        scrollTo(driver, SITE_SELECTION_TAB);
//        clickOnElement(waitToBeClickable(SITE_SELECTION_TAB, driver));
//        clickOnElement(waitToBeClickable(UK_BUTTON, driver));
//        return this;
//    }
}
