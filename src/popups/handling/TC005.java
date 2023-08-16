package popups.handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 JavascriptExecutor jse=(JavascriptExecutor) driver;
	 
	driver.get("https://www.cleartrip.com/");
    WebElement popUp = driver.findElement(By.cssSelector("path[stroke='#1A1A1A']"));
    popUp.click();
	
	driver.findElement(By.xpath("//h4[text()='Depart on']/../../following-sibling::div//button")).click();
	driver.findElement(By.xpath("//div[text()='September 2022']/../following-sibling::div//div[text()='19']")).click();
}
}
