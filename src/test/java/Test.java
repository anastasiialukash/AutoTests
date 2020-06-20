import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    @org.junit.jupiter.api.Test
    public void loginAsAdmin() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://javatop.herokuapp.com/login");
    }
}
