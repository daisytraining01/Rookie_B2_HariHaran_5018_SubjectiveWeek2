package Nickfury;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class prob1c {
    @Test
    public static void captureScreenMethod() throws Exception{
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\Avengers\\src\\main\\resources\\chromedriver.exe");   WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("http://demo.guru99.com/test/newtours/register.php");
    driver.navigate().refresh();
    driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Harry");
    driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Zeak");
    driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("0987654321");
    Thread.sleep(2000);        
    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("harry@gmail.com");

    driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("XXXXXXXXXXXX");
    driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Chennai");
    Thread.sleep(2000);        
    driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Tamil Nadu");

    driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("600045");

    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Harry");
    Thread.sleep(2000);        
    driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("Joker");

    driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("Joker");
    Thread.sleep(2000);        

    driver.findElement(By.name("submit"));
    WebElement login = driver.findElement(By.name("submit"));
    login.click();
	          
	    File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(s, new File("D:\\Project\\Ss.png"));
        
            driver.quit();
    }
    
    }