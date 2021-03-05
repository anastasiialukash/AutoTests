package tests.login;

import org.junit.jupiter.api.Test;
import pages.base.BasePage;
import pages.login.LoginPage;
import tests.base.BaseTest;


public class LoginPageTest extends BaseTest {
    protected BasePage basePage = new BasePage();
    protected LoginPage loginPage = new LoginPage();
    protected String LINK = "http://javatop.herokuapp.com/login";
    protected String NAME = "TestName";
    protected String EMAIL = "test@gmail.com";
    protected String PASSWORD = "12345";
    protected String LIMIT = "2000";

    @Test
    public void loginAsAdmin() {
        basePage.goToUrl(LINK);
        loginPage.loginAsAdmin();
        loginPage.logout();
    }

    @Test
    public void loginAsUser() {
        basePage.goToUrl(LINK);
        loginPage.loginAsUser();
        loginPage.logout();
    }

    @Test
    public void registrationTest() {
        basePage.goToUrl(LINK);
        loginPage.openRegistrationForm();
        loginPage.enterName(NAME);
        loginPage.enterEmail(EMAIL);
        loginPage.setPassword(PASSWORD);
        loginPage.setCalorieLimit(LIMIT);
        loginPage.saveRegistration();
    }
}
