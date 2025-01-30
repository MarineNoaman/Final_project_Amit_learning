package Steps;

import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Steps.Hooks.driver;

public class Loginsteps {
    Loginpage login = new Loginpage();
    Wait wait;
    @Given("home page appear user click on login button")
    public void Login_Button() throws InterruptedException {
        //press on SignUp/Login
        login.Login_Button().click();
    }

    @When("user enter his username")
    public void Username() throws InterruptedException {
        login.Username().sendKeys("Marine Noaman");
    }
    @And("user enter his password")
    public void Password() throws InterruptedException {
        login.Password().sendKeys("Amit123456");
    }
    @Then("user click on login button")
    public void LogInButton() throws InterruptedException {
        login.LogInButton().click();
    }
    @When("user enter his {string} and his {string}")
    public void InvalidData(String username,String password) throws InterruptedException {
        login.Username().sendKeys(username);
        login.Password().sendKeys(password);
        login.LogInButton().click();
    }


}