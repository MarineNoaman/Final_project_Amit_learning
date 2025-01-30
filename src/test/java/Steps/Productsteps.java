package Steps;

import Pages.Loginpage;
import Pages.Productpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static Steps.Hooks.driver;

public class Productsteps {

    Productpage product = new Productpage();
    Wait wait;

        @Given("user Click on Laptops under categories on the homepage")
        public void Laptop_Button() throws InterruptedException {
            product.Laptop_Button().click();
        }

        @When("Choose Product 1")
        public void product1() throws InterruptedException {
            product.product1().click();
        }
        @And("add product 1 to the cart")
        public void Addtocart() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(product.Addtocart())).click();
        wait=new WebDriverWait(product.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        }

       @And("user click on home page")
       public void Home() throws InterruptedException {
            product.Home().click();

       }
        @And("Choose Product 2")
        public void product2() throws InterruptedException {
        product.product2().click();
       }
    @And("add product 2 to the cart")
    public void Add_to_cart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(product.Add_to_cart())).click();
        wait=new WebDriverWait(product.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
}
    @And("user go to cart page")
    public void Cartbutton() throws InterruptedException {
        product.Cartbutton().click();
    }

    @And("user click on place order")
    public void placeorder() throws InterruptedException {
        product.placeorder().click();
    }
    @And("user fill the name")
    public void name() throws InterruptedException {
        product.name().sendKeys("Marine Noaman");
    }
    @And("user fill the country")
    public void country() throws InterruptedException {
        product.country().sendKeys("Egypt");
    }
    @And("user fill the city")
    public void city() throws InterruptedException {
        product.city().sendKeys("Alexandria");
    }
    @And("user fill the credit card number")
    public void credit_card() throws InterruptedException {
        product.credit_card().sendKeys("123456789");
    }
    @And("user fill the month")
    public void month() throws InterruptedException {
        product.month().sendKeys("12");
    }
    @And("user fill the year")
    public void year() throws InterruptedException {
        product.year().sendKeys("2027");
    }
    @And("user click purchase")
    public void purchase_button() throws InterruptedException {
        product.purchase_button().click();
    }
    @Then("user click ok")
    public void ok_button() throws InterruptedException {
        product.ok_button().click();
    }
}
