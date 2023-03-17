package Hooks;

import JiraSteps.Authorization;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static Properties.GetProperties.getProperty;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class WebHooks {
    @BeforeEach
    public void Open() throws InterruptedException {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true).
                savePageSource(true)
        );
        Configuration.driverManagerEnabled = true;
        open(getProperty("URL"));
        Authorization.Vhod();

    }

    @AfterEach
    public void close() {
        closeWebDriver();
    }


}
