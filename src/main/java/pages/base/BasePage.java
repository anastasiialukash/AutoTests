package pages.base;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void goToUrl(String url) {
        System.out.println("Go to URL");
        open(url);
    }

}
