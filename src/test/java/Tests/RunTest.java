package Tests;

import Hooks.WebHooks;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static JiraSteps.Authorization.Check;
import static JiraSteps.Bug.BugCheck;
import static JiraSteps.Bug.BugStep;
import static JiraSteps.Project.ProjectStep;
import static JiraSteps.Task.checkTask;


public class RunTest extends WebHooks {

    @Test
    @DisplayName("Проверка автризации")
    public void AuthorizationTest() {
        Check();
    }

    @DisplayName("Проверка задач в проекте")
    @Test
    public void ProjectTest() {
        ProjectStep();
    }

    @DisplayName("Проерка статуса и версии задачи")
    @Test
    public void TaskTest() {
        checkTask();
    }

    @DisplayName("Открытие дефекта и Проерка закрытия дефекта")
    @Test
    public void BugTest() {
        BugStep();
        BugCheck();

    }
}