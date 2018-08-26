import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By CategoryChoice = By.xpath("//*[@id='nav-xshop']/a[2]");


            public ChosenCategoryPage clickTodayDeals() {
                driver.findElement(CategoryChoice).click();
                return new ChosenCategoryPage(driver);

    }

}
