import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    private WebDriver driver;

    @Before

    public void start() {

        driver = new ChromeDriver();
    }

    @Test

    public void byXPathLocatorTask() {
        driver.get("https://www.avito.ru/moskva/transport");
        driver.findElements(By.xpath("//a[@title = 'Мотоциклы']/*"));
    }

    @Test
    public void byXPathLocatorTask2() {
        driver.get("https://www.avito.ru/moskva/transport");
        driver.findElements(By.xpath("//div[@class = 'catalog-counts']//a[text() = 'Автомобили' and @date-created = 'Cегодня']"));
    }

    @Test
    public void byXPathLocatorTask3() {
        driver.get("https://www.avito.ru/moskva/transport");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id = 'search']"));
        searchBox.sendKeys("Audi");
        searchBox.submit();

    }

    @After
    public void stop() {
        driver.quit();
    }
}




