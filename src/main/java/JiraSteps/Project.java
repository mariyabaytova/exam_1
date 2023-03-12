package JiraSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import static JiraElements.Project.*;
import static java.lang.Thread.sleep;

public class Project {
    @Step("Проверка задач в проекте")
    public static void ProjectStep() throws InterruptedException {
        sleep(3000);
        projectsClick.click();
        sleep(3000);
        testProjectsClick.click();
        name.click();

        // String s = name.getText();
        // Assert.assertEquals(name.getText(), s);

        taskClick.click();
        searchClick.click();

        String ss = quantityTask.getText();
        Assert.assertEquals(quantityTask.getText(), ss);
    }
}


