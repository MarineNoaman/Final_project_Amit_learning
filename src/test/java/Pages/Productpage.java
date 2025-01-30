package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Productpage {
    public  WebDriver driver = Hooks.driver;



    public WebElement Laptop_Button() throws InterruptedException {
        Thread.sleep(10000);
        return driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]"));
    }

    public WebElement product1() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//div//h4//a[@href=\"prod.html?idp_=11\"]"));
    }
    public WebElement Addtocart() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//div//a[@onclick=\"addToCart(11)\"]"));
    }

     public WebElement Home() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//div//a[@href=\"index.html\"]"));
    }
    public WebElement product2() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//div//h4//a[@href=\"prod.html?idp_=1\"]"));
    }
    public WebElement Add_to_cart() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]"));
    }

    public WebElement Cartbutton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"cart.html\"]"));
    }

    public WebElement placeorder() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
    }
    public WebElement name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"name\"]"));
    }
    public WebElement country() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"country\"]"));
    }
    public WebElement city() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"city\"]"));
    }
    public WebElement credit_card() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"card\"]"));
    }
    public WebElement month() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"month\"]"));
    }
    public WebElement year() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"year\"]"));
    }
    public WebElement purchase_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
    }
    public WebElement ok_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@class=\"confirm btn btn-lg btn-primary\"]"));
    }
}

