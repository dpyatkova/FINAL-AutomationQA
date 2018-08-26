import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProductDescriptionPageTest {

    private WebDriver driver;
    private ProductDescriptionPage productDescriptionPage;

    @Before
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/Amazon-Fire-TV-Stick-With-Alexa-Voice-Remote-Streaming-Media-Player/dp/B00ZV9RDKK/ref=gbps_img_s-4_a30e_8672cf95?smid=ATVPDKIKX0DER&pf_rd_p=b8f0f356-89c5-4ce1-a781-02aac81da30e&pf_rd_s=slot-4&pf_rd_t=701&pf_rd_i=gb_main&pf_rd_m=ATVPDKIKX0DER&pf_rd_r=D7VTF0KA0PM1KYSAF8DR");
        ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver);
    }

    @Test
    public void AddToCart() {
        CartPage cartPage = productDescriptionPage.clickAddToCart();
        String heading = productDescriptionPage.getHeadingText();
        Assert.assertEquals("Shopping Cart", heading);

    }
}
