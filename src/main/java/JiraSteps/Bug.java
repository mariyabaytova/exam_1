package JiraSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static JiraElements.Authorization.*;
import static JiraElements.Bug.*;
import static JiraElements.Project.*;
import static java.lang.Thread.sleep;

public class Bug {
    @Step
    public static void BugStep () throws InterruptedException {

        projectsClick.click();
        testProjectsClick.click();
        name.click();

        Create.click();
        subject.click();
        subject.sendKeys("TestSelenium");
        description.click();
        description.sendKeys("Шаги: 1. Перейти к задача TestSelenium 2. Посмотреть привязанную версию");
        VersionCorrect.click();
        ClickArrow.click();
        ClickArrow.sendKeys("Метка");
        sleep(2000);
        createBug.click();
        sleep(2000);
        taskClick.click();
        sleep(2000);
        searchClick.click();
        sleep(2000);
        MyTasks.click();
        sleep(2000);
       // Num.click();
        sleep(3000);
      //  InProzess.click();
        BusinessProz.click();
        sleep(3000);
        //sleep(6000);
        Done.click();

    }
    @Step
    public static void BugCheck() {

        String d = Dones.getText();
        Assert.assertEquals("ГОТОВО", d);

}
}