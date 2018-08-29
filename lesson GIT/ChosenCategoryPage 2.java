import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class ChosenCategoryPage {

    private final ElementsCollection elements = $$("//*[@id='nav-xshop']/a[2]");

    public ChosenCategoryPage getResults() {
        elements.find(attribute);
        return this;
    }

    public ProductDescriptionPage searchFor(String text) {
        $(byPartialLinkText("Elmer's Liquid School Glue")).click();

        return page(ProductDescriptionPage.class);
    }
}



