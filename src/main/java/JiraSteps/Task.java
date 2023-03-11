package JiraSteps;

import io.qameta.allure.Step;
import org.junit.Assert;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;

import static JiraElements.TaskElements.*;

public class Task {
    @Step
    public static void checkTask() {


 containsText.click();
        containsText.sendKeys("TestSelenium");
        search1.click();

    String v = version1.getText();
        Assert.assertEquals("Version 2.0", v);

    String sss = status1.getText();
        Assert.assertEquals("СДЕЛАТЬ", sss);
}
}

