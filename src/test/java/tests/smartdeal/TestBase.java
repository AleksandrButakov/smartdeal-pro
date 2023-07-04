package tests.smartdeal;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.AllureAttachments.*;
import static com.codeborne.selenide.Selenide.sessionId;
import static java.lang.System.*;

class TestBase {

    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        baseUrl = "https://smartdeal.pro";
        browser = getProperty("browser", "chrome");
        browserVersion = getProperty("browserVersion", "112.0");
        browserSize = "1920x1080";
        remote = "http://62.113.108.218:4444/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", new HashMap<String, Object>() {{
            /* How to add test badge */
            put("name", "My tests https://smartdeal.pro");

            /* How to set session timeout */
            put("sessionTimeout", "15m");

            /* How to set timezone */
            put("env", new ArrayList<String>() {{
                add("TZ=UTC");
            }});

            put("console", true);

            /* How to enableVNC */
            put("enableVNC", true);

            /* How to enable video recording */
            put("enableVideo", true);

        }});
        browserCapabilities = capabilities;
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId().toString(); //getSessionId();
        attachScreenshot("Last screenshot");
        attachPageSource();
        // browserConsoleLogs();
        closeWebDriver();
        attachVideo(sessionId);
    }

}


// !!!!!!!!!!!!!!!!! Рабочий код, не удалять!!!
//package tests.smartdeal;
//
//import com.codeborne.selenide.logevents.SelenideLogger;
//import io.qameta.allure.selenide.AllureSelenide;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//import static com.codeborne.selenide.Configuration.*;
//import static com.codeborne.selenide.Selenide.*;
//import static helpers.AllureAttachments.*;
//import static com.codeborne.selenide.Selenide.sessionId;
//import static java.lang.System.*;
//
//class TestBase {
//
//    @BeforeAll
//    static void beforeAll() throws MalformedURLException {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//
//        baseUrl = "https://smartdeal.pro";
//        browserSize = "1920x1080";
//
//        browser = getProperty("browser", "chrome");
//        browserVersion = getProperty("browserVersion", "112.0");
//
//        remote = "http://62.113.108.218:4444/wd/hub";
//
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", new HashMap<String, Object>() {{
//            /* How to add test badge */
//put("name", "My tests https://smartdeal.pro");
//
//    /* How to set session timeout */
//    put("sessionTimeout", "15m");
//
//    /* How to set timezone */
//    put("env", new ArrayList<String>() {{
//        add("TZ=UTC");
//    }});
//
//        put("console", true);
//
//        /* How to enableVNC */
//        put("enableVNC", true);
//
//        /* How to enable video recording */
//        put("enableVideo", true);
//
//        }});
//        browserCapabilities = capabilities;
//        }
//
//@BeforeEach
//    void beforeEach() {
//            }
//
//@AfterEach
//public void afterEach() {
//        String sessionId = sessionId().toString(); //getSessionId();
//        attachScreenshot("Last screenshot");
//        attachPageSource();
//        // browserConsoleLogs();
//        closeWebDriver();
//        attachVideo(sessionId);
//        }
//
//        }