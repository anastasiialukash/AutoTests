package pages.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class LoginPage {

    protected final SelenideElement buttonLoginAsAdmin = $x("/html/body/div[1]/div/div[1]/button[2]");
    protected final SelenideElement buttonLoginAsUser = $x("/html/body/div[1]/div/div[1]/button[1]");
    protected final SelenideElement logoutButton = $(By.xpath("//*[@id='command']/button"));
    protected final SelenideElement registrationButton = $(By.xpath("//*[contains(text(),'Регистрация')]"));
    protected final SelenideElement nameField = $(By.xpath("//*[@id='name']"));
    protected final SelenideElement emailField = $(By.xpath("//*[@id='email']"));
    protected final SelenideElement passwordField = $(By.xpath("//*[@id='password']"));
    protected final SelenideElement limitField = $(By.xpath("//*[@id='caloriesPerDay']"));
    protected final SelenideElement saveRegistrationBtn = $(By.xpath("//*[@id='userTo']/div[5]/button"));

    public void loginAsAdmin() {
        buttonLoginAsAdmin.shouldBe(Condition.visible).click();
    }

    public void loginAsUser() {
        buttonLoginAsUser.shouldBe(Condition.visible).click();
    }

    public void logout() {
        logoutButton.shouldBe(Condition.visible).click();
    }

    public void openRegistrationForm() {
        registrationButton.shouldBe(Condition.visible).click();
    }

    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void setCalorieLimit(String limit) {
        limitField.sendKeys(limit);
    }

    public void saveRegistration() {
        saveRegistrationBtn.click();
    }
}
