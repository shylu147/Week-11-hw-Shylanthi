package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserProject1 {
    static String browser ="Edge";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("Chrome")) {
             driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else
        { System.out.println("Wrong browser");}

            driver.get(baseUrl);
            //Maximize Browser
            driver.manage().window().maximize();
            //We give Implicit wait to Driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            //Get the title of the page
            String title =driver.getTitle();
            System.out.println("Page title is " +title);
            //Print the current URL
            System.out.println("Current URL is " +driver.getCurrentUrl());

            //Print  the page source
            System.out.println("Page source is " +driver.getPageSource());
            driver.findElement(By.id("Email")).sendKeys("shylanthi@yahoo.com");
            //Enter password to password field
          driver.findElement(By.name("Password")).sendKeys("shyla2354");
          Thread.sleep(3000);
            driver.close();

        }}
