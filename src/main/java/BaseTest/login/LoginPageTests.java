package BaseTest.login;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTests {
    @Test
    public void loginAsAdmin() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://javatop.herokuapp.com/login");
        WebElement button = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[2]"));
        button.click();

    }
}
