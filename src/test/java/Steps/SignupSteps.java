package Steps;

import Pages.Loginpage;
import Pages.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Steps.Hooks.driver;

public class SignupSteps {
        SignupPage signup = new SignupPage();
    Wait wait;
        @Given("home page appear user click on Signup button")
        public void Signup_Button() throws InterruptedException {
            //press on SignUp/Login
            signup.Signup_Button().click();
        }

        @When("user enter the username")
        public void Username() throws InterruptedException {
            signup.Username().sendKeys("Marine Noaman");
        }
        @And("user enter the password")
        public void Password() throws InterruptedException {
            signup.Password().sendKeys("Amit123456");
        }
        @Then("user click on Signup button")
        public void Signup() throws InterruptedException {
            signup.Signup().click();
        }
    @When("user enter {string} and {string}")
    public void InvalidData(String Username,String Password) throws InterruptedException {
        signup.Username().sendKeys(Username);
        signup.Password().sendKeys(Password);
        signup.Signup().click();
        wait=new WebDriverWait(signup.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        }
}
