package pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(ProductPage.class.getSimpleName());

    @FindBy(xpath = "//*[@data-bind='text: buttonText' and text()='Add to bag']")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@class='_1z5n7CN' and text()='1']")
    public WebElement cartStatusOnIcon;

    @FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
    public WebElement savedProductsIcon;

    @FindBy(xpath = "//button[@class='deleteButton_Za13- deleteButton_2VxuB']")
    public WebElement deleteFromSavedProducts;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    @Step("Add product to cart")
    public ProductPage addItemToCart() {
        logger.info("Adding product to cart");
        clickOnElement(waitToBeClickable(addToCart, driver));
        return this;
    }
    @Step("Go to the saved products")
    public ProductPage goToSavedProducts() {
        logger.info("Go to saved products page");
        clickOnElement(waitToBeClickable(savedProductsIcon, driver));
        return this;
    }
    @Step("Delete saved product")
    public ProductPage deleteProductFromSaved() {
        logger.info("Delete product from saved");
        clickOnElement(waitToBeClickable(deleteFromSavedProducts, driver));
        return this;
    }
}
