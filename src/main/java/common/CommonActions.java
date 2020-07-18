package common;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CommonActions {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonActions.class);


    public static void clearBrowserCookiesAndStorage() {
        if (Config.CLEAR_COOKIES) {
            try {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.sessionStorage.clear()");
            }
            catch (Exception e) {
                LOGGER.error("Fail tp clearBrowserCookiesAndStorage - {}" + e.getMessage());
            }
        }
    }

}
