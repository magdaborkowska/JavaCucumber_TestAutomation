package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(HomePage.class.getSimpleName());

    @FindBy(xpath = "//button[@data-index='5' and @aria-expanded='true']")
    public WebElement pickCategoryAccessories;

    @FindBy(xpath = "//a[@href='https://www.asos.com/women/sunglasses/cat/?cid=4545&nlid=ww|accessories|shop+by+product|sunglasses']")
    public WebElement pickSubcategorySunglasses;

    @FindBy(xpath = "//*[@class='_3WEsAhb' and @xpath='1']")
    public WebElement takeFirstItem;

    @FindBy(xpath = "//a[@href='https://www.asos.com/women/' and text()='WOMEN']")
    public WebElement addressOnCategoryPage;


    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public CategoryPage clickOnTheCategoryAccessories() {
        logger.info("Click on the Woman category");
        pickCategoryAccessories.click();
        return this;
    }

    public CategoryPage clickOnTheSubcategorySunglasses() {
        logger.info("Click on the Woman category");
        pickSubcategorySunglasses.click();
        return this;
    }

    public CategoryPage takeFirstItem() {
        logger.info("Click on the first item");
        takeFirstItem.click();
        return this;
    }

}