package JiraSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static JiraElements.Authorization.*;
import static Properties.GetProperties.getProperty;

public class Authorization {
    @Step("Авторизация")

    public static void Vhod() throws InterruptedException {
        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        loginInput.setValue(getProperty("login"));
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue(getProperty("password"));
        rememberMe.click();
        entranceButton.click();
    }

    @Step("Проверка авторизации")
    public static void Check() {
        String s = entrance.getText();
        Assertions.assertEquals("System Dashboard", s);
    }
}
