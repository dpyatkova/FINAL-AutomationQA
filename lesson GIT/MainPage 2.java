import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class MainPage {

    public MainPage open(){

        Selenide.open("/");
        return this;

//        Configuration.browser = "chrome";
//        open("https://www.amazon.com/");
        }

    public ChosenCategoryPage searchFor(String text) {
       // $("twotabsearchtextbox").val(text).pressEnter();
        $(byText("Back to School")).click();

        return page(ChosenCategoryPage.class);

    }

    }





