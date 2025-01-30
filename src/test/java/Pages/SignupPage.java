package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
    public WebDriver driver = Hooks.driver;


    public WebElement Signup_Button() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//a[@id=\"signin2\"]"));
    }

    public WebElement Username() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//input[@id=\"sign-username\"]"));
    }

    public WebElement Password() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//input[@id=\"sign-password\"]"));
    }
    public WebElement Signup() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//button[@onclick=\"register()\"]"));
    }
}
