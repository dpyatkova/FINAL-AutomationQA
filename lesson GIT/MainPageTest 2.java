import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    MainPage mainPage = new MainPage();
    ChosenCategoryPage chosenCategoryPage = new ChosenCategoryPage();

@BeforeClass

    public static void SetUp(){
    Configuration.browser = "chrome";
    open("https://www.amazon.com/");
}
@Test
    public void userCanSearch() {
    MainPage mainPage = open("https://www.amazon.com/", MainPage.class);
    ChosenCategoryPage results = mainPage.searchFor("Back to School");
    results.getResults().find(Condition.attribute("//*[@id = 'amazonlive-react-page']"));

}

}
