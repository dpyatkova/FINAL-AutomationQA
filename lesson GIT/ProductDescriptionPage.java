import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDescriptionPage {
    WebDriver driver;

    public ProductDescriptionPage(WebDriver driver) {
        this.driver = driver;
    }

        private By heading = By.xpath("//*[@id = 'productTitle'");
        private By AddingToCart = By.xpath("//*[@id = 'add-to-cart-button']");


        public String getHeadingText() {
            return driver.findElement(heading).getText();

        }

        public CartPage clickAddToCart() {
            driver.findElement(AddingToCart).click();
            return new CartPage(driver);

        }
    }

