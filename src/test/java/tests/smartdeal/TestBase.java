package tests.smartdeal;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static tests.helpers.Attach.*;
import static com.codeborne.selenide.Selenide.sessionId;

class TestBase {

    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        // SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        baseUrl = "https://smartdeal.pro";
        browser = "chrome";
        browserVersion = "112.0";
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

            /* How to enableVNC */
            put("enableVNC", true);

            /* How to enable video recording */
            put("enableVideo", true);

        }});
        browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(baseUrl);
    }

//    @AfterEach
//    void addAttachments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        Attach.addVideo();
//
//    }

    @AfterEach
    public void afterEach(){
        String sessionId = sessionId().toString(); //getSessionId();
        attachScreenshot("Last screenshot");
        attachPageSource();
        //attachAsText("Browser console logs", getConsoleLogs());
        closeWebDriver();
        attachVideo(sessionId);
    }


}