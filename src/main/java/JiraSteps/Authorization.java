package JiraSteps;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static JiraElements.Authorization.*;
import static Properties.GetProperties.getProperty;

import io.qameta.allure.Step;
import org.junit.Assert;

public class Authorization {
    @Step("Автризация")
    public static void Vhod() throws InterruptedException {
        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        loginInput.setValue(getProperty("login"));
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue(getProperty("password"));
        rememberMe.click();
        entranceButton.click();
    }

    @Step("Проверка автризации")
    public static void Check() {
        String s = entrance.getText();
        Assert.assertEquals("System Dashboard", s);
    }
}
