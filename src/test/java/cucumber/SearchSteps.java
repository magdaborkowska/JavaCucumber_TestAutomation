package cucumber;

import context.CucumberStepContext;
import drivers.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SearchSteps {

    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    private static final Logger logger = LogManager.getLogger(SearchSteps.class.getSimpleName());


    protected WebElement waitToBeVisible(WebElement element, WebDriver driver) {
        WebElement visibleElement = null;
        try {
            visibleElement = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Element was not loaded!");
        }
        return visibleElement;
    }


    @Then("The user is redirected to page with results for search")
    public void pageWithResultsForSearchText() {
        logger.info("Verifying text on page");
        Assert.assertTrue(waitToBeVisible(pageManager.resultsPage().resultsPageText, driver).isDisplayed());
    }

    @Then("The user save the product")
    public void saveTheProduct() {
        logger.info("Verifying text on page");
        waitToBeVisible(pageManager.resultsPage().saveTheProduct,driver);
        pageManager.resultsPage().saveTheProductForLater();
    }

    @When("The user go to saved products")
    public void clickOnSavedProducts() {
        logger.info("Verifying text on page");
        waitToBeVisible(pageManager.productPage().savedProductsIcon,driver);
        pageManager.productPage().goToSavedProducts();
    }

    @Then("The user is redirected to page with saved products")
    public void PageWithSavedProductsStatus() {
        logger.info("Verifying text on page");
        Assert.assertTrue(waitToBeVisible(pageManager.savedProductsPage().savedProductsSortBy, driver).isDisplayed());
    }

    @And("The user go to the first product page")
    public void goToTheFirstProductPage() {
        logger.info("Verifying text on page");
        pageManager.resultsPage().acceptTheCookies();
        pageManager.resultsPage().acceptCountryCookies();
        waitToBeVisible(pageManager.resultsPage().selectedGlassesProduct,driver);
        pageManager.resultsPage().clickOnTheFirstGlassesProduct();
    }

    @And("The user go to the first product from watches result page")
    public void goToTheFirstProductFromWatchesResultPage() {
        logger.info("Verifying text on page");
        pageManager.resultsPage().acceptTheCookies();
        pageManager.resultsPage().acceptCountryCookies();
        waitToBeVisible(pageManager.resultsPage().selectedWatchesProduct,driver);
        pageManager.resultsPage().clickOnTheFirstWatchesProduct();
    }

    @When("The user delete the products from saved")
    public void deleteTheProductsFromSaved() {
        logger.info("Verifying text on page");
        waitToBeVisible(pageManager.productPage().deleteFromSavedProducts,driver);
        pageManager.productPage().deleteProductFromSaved();
    }

    @Then("There the saved section is empty")
    public void savedSectionEmptyText() {
        logger.info("Verifying text on page");
        Assert.assertTrue(waitToBeVisible(pageManager.savedProductsPage().savedProductsSectionEmpty, driver).isDisplayed());

    }
}


//    @When("The user clicks on the Shop Women button")
//    public void clickOnTheShopWomenButton() {
//        waitToBeVisible(pageManager.homePage().shopWomanButton,driver);
//        pageManager.homePage().clickOnTheShopWomanButton();
//    }
//
//    @Then("The user is redirected to category page")
//    public void theUserIsRedirectedToCategoryPage() {
//        waitToBeVisible(pageManager.categoryPage().addressOnCategoryPage,driver);
//        Assert.assertTrue((pageManager.categoryPage().addressOnCategoryPage.isDisplayed()));
//    }
//
//    @When("The user selects a category Accessories")
//    public void selectTheCategoryAccessories() {
//        waitToBeVisible(pageManager.categoryPage().pickCategoryAccessories,driver);
//        pageManager.categoryPage().clickOnTheCategoryAccessories();
//    }
//
//    @And("User selects a subcategory Sunglasses")
//    public void selectSubcategorySunglasses() {
//        waitToBeVisible(pageManager.categoryPage().pickSubcategorySunglasses,driver);
//        pageManager.categoryPage().clickOnTheSubcategorySunglasses();
//    }
//
//    @And("User adds first item to the cart")
//    public void addFirstItemToTheCart() {
//        waitToBeVisible(pageManager.categoryPage().takeFirstItem,driver);
//        pageManager.categoryPage().takeFirstItem();
//        waitToBeVisible(pageManager.productPage().addToCart,driver);
//        pageManager.productPage().addItemToCart();
//    }
//
//    @Then("Cart icon status on the nav bar is changed")
//    public void cartIconStatus() {
//        waitToBeVisible(pageManager.productPage().cartStatusOnIcon,driver);
//        Assert.assertTrue((pageManager.productPage().cartStatusOnIcon.isDisplayed()));
//    }

//}
