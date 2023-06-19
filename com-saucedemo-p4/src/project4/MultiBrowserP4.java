package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserP4 {
    static  String browser = "Chrome";
    static WebDriver driver;
    static  String baseUrL = "https://www.saucedemo.com/";

    public static void main(String[] args) throws InterruptedException {
        if(browser.equalsIgnoreCase("Chrome")){
             driver=new ChromeDriver();

        } else if ((browser.equalsIgnoreCase("Edge"))) {
             driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase(("FireFox")) ){
             driver= new FirefoxDriver();
        }else
        {System.out.println("wrong browser");
        }
        driver.get(baseUrL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Page title is " +title);

        //Get current URL
        System.out.println("Current URL " +driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source " +driver.getPageSource());

        driver.findElement(By.id("user-name")).sendKeys("Shyla@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("Shyla123");
        Thread.sleep(3000);

        driver.close();
}}
