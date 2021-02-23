package Nickfury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class prob4 {
    @Test   
    public void executSessionOne(){
            //First session of WebDriver
        try {
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\Avengers\\src\\main\\resources\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            driver.findElement(By.name("password")).sendKeys("Driver 1");
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        }
       
    @Test   
        public void executeSessionTwo(){
            //Second session of WebDriver
        try {
         System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\eclipse-workspace\\Avengers\\src\\test\\java\\Nickfury\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.findElement(By.name("password")).sendKeys("Driver 2");
        driver.findElement(By.name("password")).sendKeys("Driver 1");
        Thread.sleep(2000);
    }catch(InterruptedException e) {
        System.out.println(e);
        
    }

        }
       
       
   
}
