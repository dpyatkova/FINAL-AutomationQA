import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChosenCategoryPage {

    WebDriver driver;

    public ChosenCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//*[@id='gbox-item-0.0.0']/div/div/div[1]/h1/div[1]");
    private By ChosingProduct = By.xpath("//*[@id='dealImage']/div/div/div[2]");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

        public ProductDescriptionPage clickChosenProduct() {
            driver.findElement(ChosingProduct).click();
            return new ProductDescriptionPage(driver);
        }
    }



