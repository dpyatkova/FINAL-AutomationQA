import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    @Test
    public void LoginTest1() {

        driver = new ChromeDriver();
        driver.get("https://www.survio.com/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("reg_name")).sendKeys("Рената");

        driver.findElement(By.name("reg_email")).sendKeys("bubesha@gmail.com");

        driver.findElement(By.name("reg_passwd")).sendKeys("12345678");

        driver.findElement(By.className("create-survey")).click();

    }
        @Test
        public void LoginTest2() {
            driver = new ChromeDriver();
            driver.get("https://www.survio.com/");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.name("reg_name")).sendKeys("Рената");

            driver.findElement(By.name("reg_email")).sendKeys("bubesha@gmail.com");

            driver.findElement(By.name("reg_passwd")).sendKeys("");

            driver.findElement(By.className("create-survey")).click();

        }

        @After
    public void stop() {
        driver.quit();
        driver = null;
        }

        }





