package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserP1 {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";

        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into the browser
        driver.get(baseUrl);
        //Maximize the browser
        driver.manage().window().maximize();
        //Give implicit wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title =driver.getTitle();
        System.out.println("Page title is " +title);
        //Print the current URL
        System.out.println("Current URL is " +driver.getCurrentUrl());
        //Print  the page source
        System.out.println("Page source is " +driver.getPageSource());

        // Enter the email ti emailfield
        driver.findElement(By.id("Email")).sendKeys("shylanthi@yahoo.com");
        //Enter password to password field
        driver.findElement(By.name("Password")).sendKeys("shyla2354");
        Thread.sleep(3000);
        driver.close();

    }
}
