mport com.codeborne.selenide.Condition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ChosenCategoryPageTest {

    ChosenCategoryPage chosenCategoryPage = new ChosenCategoryPage();
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();

    @BeforeClass

    public static void SetUp(){
        Configuration.browser = "chrome";
        open("https://www.amazon.com/gp/browse.html?node=1065840&ref=nav_cs_bts18");
    }
    @Test
    public void userCanSearch() {
        ChosenCategoryPage chosenCategoryPage = open("https://www.amazon.com/gp/browse.html?node=1065840&ref=nav_cs_bts18", ChosenCategoryPage.class);
        ProductDescriptionPage results = chosenCategoryPage.searchFor("Elmer's Liquid School Glue");
        results.getResult().find(Condition.attribute("//div[@id='titleSection']/h1"));

    }

}
