import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before

    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        mainPage = new MainPage(driver);

    }

    @Test

    public void TodayDeals() {
        ChosenCategoryPage ChosenCategoryPage = mainPage.clickTodayDeals();
        String heading = ChosenCategoryPage.getHeadingText();
        Assert.assertEquals("Today's Deals", heading);
    }

    @After

    public void CleanUp(){
        driver.quit();
    }
}
