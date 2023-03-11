package Hooks;

import JiraSteps.Authorization;
import Properties.Configurations;
import Properties.GetProperties;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.AfterClass;
//import org.junit.jupiter.api.BeforeAll;
;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

//import java.util.Properties;
//import org.junit.jupiter.api.BeforeEach;

import java.time.Duration;

import static JiraElements.Authorization.*;
import static JiraElements.Authorization.entranceButton;
import static JiraSteps.Authorization.Vhod;
import static Properties.GetProperties.getProperty;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class WebHooks {
  private static SelenideDriver browser;
   private static SelenideConfig browserConfig;
    public WebDriver driver;
   // WebHooks webhook = new WebHooks();

   // webhook.se======
    //String url = props.getProperty("URL");
    @Before
    public void Open() throws InterruptedException {
        Configuration.startMaximized = true;
        open(getProperty("URL"));

        //open(Configurations.baseUrls);
//open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
      // authentication(System.getProperty("login"), getProperty("password"));
       Authorization.Vhod();
        //  authentication("login", "password");
       // rememberMe.click();
     //   entranceButton.click();

    }
    @BeforeAll
    public static void  allures(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true).
                savePageSource(true)
        );
    }




    @After
    public void close(){
       // closeWebDriver();
    }

  //  @AfterClass
  //  public static void End () {

 //   }

}
