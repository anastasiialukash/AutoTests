package pages.base;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void goToUrl(String url) {
        open(url);
    }

}
