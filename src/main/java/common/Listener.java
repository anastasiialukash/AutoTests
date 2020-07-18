package common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Listener implements TestWatcher, BeforeAllCallback , AfterAllCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        extensionContext.getRoot().getStore(ExtensionContext.Namespace.GLOBAL).put(true, this);
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        CommonActions.clearBrowserCookiesAndStorage();
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOGGER.info("Test {} failed", context.getTestMethod().get().getName());

        String screenshotName = context.getTestMethod().get().getName() +
                String.valueOf(System.currentTimeMillis()).substring(9, 13);
        LOGGER.info("Trying to get a screenshot...");
        Selenide.screenshot(screenshotName);
        attachScreenshotsToAllure();
    }


    @Attachment(value = "Attachement screenshot", type = "image/png")
    public byte [] attachScreenshotsToAllure() {
        if(WebDriverRunner.hasWebDriverStarted())
            return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        else return null;
    }
}
