package tests.smartdeal;

import com.codeborne.selenide.Configuration;
import com.google.common.eventbus.AllowConcurrentEvents;
import org.checkerframework.checker.units.qual.Current;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

public class TestMainPage extends TestBase {
    @Test
    @Tag("ui")
    @DisplayName("Проверка ссылки 'Кейсы'")
    void checkingTheButtonForServices() {
        step("Checking the button for services", () -> {
            open(baseUrl);
            $$(".header__menuItem").findBy(text("Кредиты")).hover();
            //$$(".tn-atom").findBy(text("Кейсы")).click();
            //$$(".tn-atom").findBy(text("Кейсы SmartDeal")).click();
            sleep(5000);

//            $$(".tn-atom").findBy(text("Треугольная сделка"))
//                    .shouldHave(text("Треугольная сделка"));
        });
    }

    // !!!!!!!!!!!!!!!!
    @Disabled
    @Test
    @Tag("ui")
    @DisplayName("Проверка кнопки 'Застройщикам'")
    void checkingTheButtonForDevelopers() {
        step("Checking the button for developers", () -> {
            open(baseUrl);
            $$(".tn-atom").findBy(text("Застройщикам")).click();
            $$(".tn-atom").findBy(text("Мы предлагаем"))
                    .shouldHave(text("Мы предлагаем"));
        });
    }

    // !!!!!!!!!!!!!!!!
    @Disabled
    @Test
    @Tag("ui")
    @DisplayName("Проверка кнопки 'Получить консультацию'")
    void checkingTheGetAdviceButton() {
        step("Checking the button for developers", () -> {
            open(baseUrl);
            $$(".tn-atom").findBy(text("Получить консультацию")).click();
            $$(".tn-atom").findBy(text("Получить консультацию"))
                    .shouldHave(text("Получить консультацию"));
        });
    }

    // !!!!!!!!!!!!!!!!
    @Disabled
    @Test
    @Order(1)
    @Tag("ui")
    @DisplayName("2Проверка кнопки 'Получить консультацию'")
    void checkingTheGetAdviceButton2() {
        step("Checking the button for developers", () -> {
            open(baseUrl);
            $$(".tn-atom").findBy(text("Получить консультацию")).click();
            $$(".tn-atom").findBy(text("Получить консультацию"))
                    .shouldHave(text("Получить консультацию"));
        });
    }

    // !!!!!!!!!!!!!!!!
    @Disabled
    @Test
    @Order(2)
    @Tag("ui")
    @DisplayName("3Проверка кнопки 'Получить консультацию'")
    void checkingTheGetAdviceButton3() {
        step("Checking the button for developers", () -> {
            open(baseUrl);
            $$(".tn-atom").findBy(text("Получить консультацию")).click();
            $$(".tn-atom").findBy(text("Получить консультацию"))
                    .shouldHave(text("Получить консультацию"));
        });
    }

    @Disabled
    @Test
    @DisplayName("Проверка ссылки 'Блог'")
    void  checkingTheBlogLink() {

    }

    @Disabled
    @Test
    @DisplayName("Проверка ссылки 'Команда'")
    void checkingTheLinkCommand() {

    }

    @Disabled
    @Test
    @DisplayName("Проверка ссылки 'Контакты'")
    void checkingTheContactsLink() {

    }

    @Disabled
    @Test
    @DisplayName("Проверка ссылки 'Справочный центр'")
    void checkingTheHelpCenterLink() {

    }

    @Disabled
    @Test
    @DisplayName("Проверка ссылки 'Тарифы'")
    void checkingTheLinkRates() {

    }

    @Disabled
    @Test
    @DisplayName("Проверка ссылки 'Правовая информация'")
    void linkVerificationLegalInformation() {

    }

    @Disabled
    @Test
    void successfulRegistrationTest() {
        step("Open registrations form", () -> {
            open("/automation-practice-form");
            $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('footer').remove()");
        });

        step("Fill form", () -> {
            $("#firstName").setValue("Alex");
            $("#lastName").setValue("Egorov");
            $("#userEmail").setValue("alex@egorov.com");
            $("#genterWrapper").$(byText("Other")).click(); // best
            $("#userNumber").setValue("1234567890");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("July");
            $(".react-datepicker__year-select").selectOption("2008");
            $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
            $("#subjectsInput").setValue("Math").pressEnter();
            $("#hobbiesWrapper").$(byText("Sports")).click();
            $("#uploadPicture").uploadFromClasspath("img/1.png");
            $("#currentAddress").setValue("Some address 1");
            $("#state").click();
            $("#stateCity-wrapper").$(byText("NCR")).click();
            $("#city").click();
            $("#stateCity-wrapper").$(byText("Delhi")).click();
            $("#submit").click();
        });

        step("Check form results", () -> {
            $(".modal-dialog").should(appear);
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            $(".table-responsive").shouldHave(text("Alex"), text("Egorov"),
                    text("alex@egorov.com"), text("1234567890"));
        });

    }
}