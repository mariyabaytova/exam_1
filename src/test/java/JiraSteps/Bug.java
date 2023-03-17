package JiraSteps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static JiraElements.Bug.*;
import static JiraElements.Project.*;

public class Bug {
    @Step("Создание дефекта")
    public static void BugStep() {

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
        createBug.click();
        taskClick.click();
        searchClick.click();
        MyTasks.click();
        BusinessProz.click();
        Done.click();

    }

    @Step("Проверка закрытия дефекта")
    public static void BugCheck() {

        String d = Dones.getText();
        Assertions.assertEquals("ГОТОВО", d);

    }
}