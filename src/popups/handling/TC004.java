package popups.handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.cssSelector("svg[class='mr-7']")).click();
	
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
