package Hooks;

import JiraSteps.Authorization;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import static Properties.GetProperties.getProperty;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class WebHooks {
    private static SelenideDriver browser;
    private static SelenideConfig browserConfig;
    public WebDriver driver;

    @Before
    public void Open() throws InterruptedException {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true).
                savePageSource(true)
        );
        Configuration.startMaximized = true;
        open(getProperty("URL"));
        Authorization.Vhod();

    }

    @After
    public void close(){
        closeWebDriver();
    }



}

