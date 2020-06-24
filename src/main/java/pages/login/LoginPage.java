package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage  {
    WebDriver driver;
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    protected final String buttonLoginAsAdmin = "/html/body/div[1]/div/div[1]/button[2]";
    protected final String buttonLoginAsUser = "/html/body/div[1]/div/div[1]/button[1]";

    public void loginAsAdmin() {
        driver.findElement(By.xpath(buttonLoginAsAdmin)).click();
    }

    public void loginAsUser() {
        driver.findElement(By.xpath(buttonLoginAsUser)).click();
    }
}
