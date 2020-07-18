package pages.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class LoginPage {

    protected final SelenideElement buttonLoginAsAdmin = $x("/html/body/div[1]/div/div[1]/button[2]");
    protected final SelenideElement buttonLoginAsUser = $x("/html/body/div[1]/div/div[1]/button[1]");

    public void loginAsAdmin() {
        buttonLoginAsAdmin.shouldBe(Condition.visible).click();
    }

    public void loginAsUser() {
        buttonLoginAsUser.shouldBe(Condition.visible).click();
    }
}
