package JiraSteps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static JiraElements.Project.*;

public class Project {
    @Step("Проверка задач в проекте")
    public static void ProjectStep() {
        projectsClick.click();
        testProjectsClick.click();
        name.click();
        taskClick.click();
        searchClick.click();

        String ss = quantityTask.getText();
        Assertions.assertEquals(quantityTask.getText(), ss);
    }
}