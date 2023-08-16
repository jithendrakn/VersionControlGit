package popups.handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC006 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.autoitscript.com/site/autoit/downloads/");
	
	driver.findElement(By.xpath("//a[text()='Got it!']")).click();
	Thread.sleep(5000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	WebElement dowloadAutoIT = driver.findElement(By.cssSelector("img[title=\"Download AutoIt\"]"));
	jse.executeScript("arguments[0].click();", dowloadAutoIT);
}
}
