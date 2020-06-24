package tests.login;

import org.junit.jupiter.api.Test;
import pages.base.BasePage;
import pages.login.LoginPage;
import tests.base.BaseTest;

public class LoginPageTest extends BaseTest {
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginAsAdmin() {
        basePage.goToUrl("http://javatop.herokuapp.com/login");
        loginPage.loginAsAdmin();
    }

    @Test
    public void loginAsUser() {
        basePage.goToUrl("http://javatop.herokuapp.com/login");
        loginPage.loginAsUser();
    }

}
