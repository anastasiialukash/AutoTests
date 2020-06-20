package tests.base;

import common.CommonActions;
import common.Config;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.calorieCount.CalorieCountPage;
import pages.login.LoginPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver = CommonActions.createWebDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CalorieCountPage calorieCountPage = new CalorieCountPage(driver);
    protected LoginPage loginPage = new LoginPage(driver);

    @AfterEach
    void clearCacheAndLocalStorage() {
        if(Config.CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterAll
    void closeBrowser() {
        if(!Config.KEEP_BROWSER_OPEN) {
            driver.close();
        }
    }
}
