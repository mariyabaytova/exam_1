package TestJira;

import Hooks.WebHooks;
import io.qameta.allure.Step;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static JiraSteps.Authorization.Check;
import static JiraSteps.Authorization.Vhod;
import static JiraSteps.Bug.BugCheck;
import static JiraSteps.Bug.BugStep;
import static JiraSteps.Project.ProjectStep;
import static JiraSteps.Task.checkTask;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RunTest extends WebHooks {

    @Test
    public void AuthorizationTest() throws InterruptedException {
        Check();
    }

    @Test
    public void ProjectTest() throws InterruptedException {
        ProjectStep();
    }

    @Test
    public void TaskTest() {
        checkTask();
    }

    @Test
    public void BugTest() throws InterruptedException {
        BugStep();
        BugCheck();

    }
}
