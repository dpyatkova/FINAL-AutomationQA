import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChosenCategoryPageTest {

    private WebDriver driver;
    private ChosenCategoryPage chosenCategoryPage;

    @Before
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/gp/goldbox?ref=nav_cs_gb");
        ChosenCategoryPage chosenCategoryPage = new ChosenCategoryPage(driver);
    }

    @Test
    public void ChooseProduct() {
        ProductDescriptionPage productDescriptionPage = chosenCategoryPage.clickChosenProduct();
        String heading = productDescriptionPage.getHeadingText();
        Assert.assertEquals("Fire TV Stick with Alexa Voice Remote | Streaming Media Player", heading);
    }

    @After
    public void CleanUp() {
        driver.quit();
    }
}
