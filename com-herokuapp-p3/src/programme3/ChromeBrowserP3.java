package programme3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserP3 {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl ="http://the-internet.herokuapp.com/login";

        //Launch the Chrome browser
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


        // Enter the email to emailfield
        driver.findElement(By.name("username")).sendKeys("shylanthi@yahoo.com");
        //Enter password to password field
        driver.findElement(By.name("password")).sendKeys("shyla2354");

        Thread.sleep(3000);

        driver.close();
}}
