import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.LogoutPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTests{
    private SHAFT.GUI.WebDriver driver;
    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate user logout")
    private void validateLogout(){
        new LogoutPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnSignupPageButton().ValidateLoginField().fillEmailTextField("Sam@yahoo.com")
                .fillPasswordTextField("123456").clickOnLoginButton().ValidateLoggedIn().clickOnLogoutButton()
                .ValidateLoginField();

    }
}