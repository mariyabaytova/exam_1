package JiraElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Authorization {

    public static SelenideElement loginInput = $x("//input[@name='os_username']").as("Ввод логина");
    public static SelenideElement passwordInput = $x("//input[@name='os_password']").as("Ввод пароля");
    public static SelenideElement rememberMe = $x("//label[@for='login-form-remember-me']").as("Запомнить меня");
    public static SelenideElement entranceButton = $x("//input[@value='Вход']").as("Войти");
    public static SelenideElement entrance = $x("//div[@class='aui-page-header-main']//h1[text()='System Dashboard']").as("System Dashboard");
}

