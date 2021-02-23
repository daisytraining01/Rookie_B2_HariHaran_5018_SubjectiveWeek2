package Nickfury;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prob2 {
public static void main(String[] args){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\Avengers\\src\\main\\resources\\chromedriver.exe"); //wrong path execution will work
	 WebDriver driver = new ChromeDriver();
driver.get("https://maveric-systems.com/"
+ "");
driver.manage().window().maximize();
List<WebElement> allLinks = driver.findElements(By.tagName("a"));

for(WebElement link:allLinks){
System.out.println(link.getText() + " - " + link.getAttribute("href"));
}

 driver.quit();
}
}