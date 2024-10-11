package org.example;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LogoutPage {
    private SHAFT.GUI.WebDriver driver ;

    public LogoutPage (SHAFT.GUI.WebDriver driver) { this.driver = driver ;}


    private By HomePage = By.xpath ("//a[@style=\"color: orange;\"]");
    private By SignupPageButton = By.xpath ("//a[@href=\"/login\"]//i[@class=\"fa fa-lock\"]");
    private By LoginField = By.xpath ("//div[@class=\"login-form\"]//h2");
    private By EmailTextField = By.xpath ("//input[@data-qa=\"login-email\"]");
    private By PasswordTextField = By.xpath ("//input[@data-qa=\"login-password\"]");
    private By LoginButton = By.xpath ("//button[@data-qa=\"login-button\"]");
    private By LoggedIn = By.xpath ("//ul[@class=\"nav navbar-nav\"]");
    private By LogoutButton = By.xpath ("//a[@href=\"/logout\"]");

    public LogoutPage navigateToURL (String URL) {
        driver.browser().navigateToURL(URL);
        return this ;
    }

public LogoutPage clickOnSignupPageButton(){
    driver.element().click(SignupPageButton);
    return this ;
}

public LogoutPage fillEmailTextField(String email){
    driver.element().type(EmailTextField , email);
    return this;
}

public LogoutPage fillPasswordTextField(String password){
    driver.element().type(PasswordTextField , password);
    return this;
}

    public LogoutPage clickOnLoginButton() {
        driver.element().click(LoginButton);
        return this ;
    }


@Step("Validate that the user is on Home Page")
public LogoutPage ValidateHomePage(){
    driver.element().verifyThat(HomePage).text().isEqualTo("Home");
    return this;
}

@Step("Validate that 'Login to your account' is visible")
public LogoutPage ValidateLoginField(){
    driver.element().verifyThat(LoginField).text().contains("Login to your account");
    return this;
}

@Step("Validate that the user has logged in")
public LogoutPage ValidateLoggedIn(){
    driver.element().verifyThat(LoggedIn).text().contains("Logged in as Sam");
    return this;
}


    public LogoutPage clickOnLogoutButton() {
        driver.element().click(LogoutButton);
        return this ;
    }
}