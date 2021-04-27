package drivers;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageManager {

    public WebDriver driver;
    private HomePage homePage;
    private ProductPage productPage;
    private ResultsPage resultsPage;
    private CartPage cartPage;
    private CategoryPage categoryPage;
    private SavedProductsPage savedProductsPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        if (homePage == null)
            homePage = new HomePage(driver);
        return homePage;
    }

    public ProductPage productPage() {
        if (productPage == null)
            productPage = new ProductPage(driver);
        return productPage;
    }

    public ResultsPage resultsPage() {
        if (resultsPage == null)
            resultsPage = new ResultsPage(driver);
        return resultsPage;
    }

    public CartPage cartPage() {
        if (cartPage == null)
            cartPage = new CartPage(driver);
        return cartPage;
    }
    public CategoryPage categoryPage() {
        if (categoryPage == null)
            categoryPage = new CategoryPage(driver);
        return categoryPage;
    }
    public SavedProductsPage savedProductsPage() {
        if (savedProductsPage == null)
            savedProductsPage = new SavedProductsPage(driver);
        return savedProductsPage;
    }

}
