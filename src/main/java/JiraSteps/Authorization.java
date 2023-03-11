package JiraSteps;

import com.codeborne.selenide.Condition;

import java.time.Duration;
import java.util.Properties;

import static JiraElements.Authorization.*;
import static Properties.GetProperties.getProperty;
import static java.lang.Thread.sleep;

import io.qameta.allure.Step;
import org.junit.Assert;

public class Authorization {
    @Step
    public static void Vhod() throws InterruptedException {
        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
       // loginInput.click();
        loginInput.setValue(getProperty("login"));
       // sleep(3000);
        // loginInput.sendKeys("mbaitova");
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue(getProperty("password"));
      //  sleep(3000);
      //  sleep(3000);
        rememberMe.click();
      //  sleep(3000);
        entranceButton.click();
      //  sleep(3000);
    }

    @Step
    public static void Check() {
        String s = entrance.getText();
        Assert.assertEquals("System Dashboard", s);
    }
}
