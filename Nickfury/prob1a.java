package Nickfury;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prob1a {
	    public static void main(String[] args) throws InterruptedException {
	        
	        File file = new File("drivers/chromedriver_new.exe");
	        String filePath = file.getAbsolutePath();
	        System.out.println(filePath);
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\Avengers\\src\\main\\resources\\chromedriver.exe");WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
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
	Thread.sleep(3000);        
	driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
	Thread.sleep(3000);        
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("Harry");
	driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Joker");
	driver.findElement(By.name("submit"));
	WebElement login1 = driver.findElement(By.name("submit"));
	Thread.sleep(1000); 
	login1.click();
	Thread.sleep(1000); 
	driver.quit();
	}
	    
}
