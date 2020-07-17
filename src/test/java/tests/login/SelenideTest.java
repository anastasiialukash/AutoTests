package tests.login;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void test() {
        open("https://www.google.com/");
        $x("/html/body/div[1]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input").setValue("chromedriver").pressEnter();
        ////*[@id="result-stats"]
        $x("//*[@id=\"result-stats\"]").shouldBe(Condition.visible);
    }
}
