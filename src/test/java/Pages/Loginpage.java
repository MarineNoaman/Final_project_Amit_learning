package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    public WebDriver driver = Hooks.driver;


    public WebElement Login_Button() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//a[@id=\"login2\"]"));
    }

    public WebElement Username() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//input[@id=\"loginusername\"]"));
    }

    public WebElement Password() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//input[@id=\"loginpassword\"]"));
    }
    public WebElement LogInButton() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//div//button[@onclick=\"logIn()\"]"));
    }
}