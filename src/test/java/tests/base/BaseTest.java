package tests.base;

import common.Config;
import common.Listener;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.calorieCount.CalorieCountPage;
import pages.login.LoginPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(Listener.class)
public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected CalorieCountPage calorieCountPage = new CalorieCountPage();
    protected LoginPage loginPage = new LoginPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    static {
        LOGGER.info("START TIME: " + LocalTime.now());
        LOGGER.info("Start to clear the dir: build/reports...");
        File allureResults = new File("allure-results");
        if(allureResults.isDirectory()) {
            for(File item : Objects.requireNonNull(allureResults.listFiles())) {
                item.delete();
            }
        }
        if(Config.CLEAR_REPORTS_DIR) {
            File testsScreenshot = new File("build/reports/tests");
            for(File item : Objects.requireNonNull(testsScreenshot.listFiles())) {
                item.delete();
            }
        }
    }


}
