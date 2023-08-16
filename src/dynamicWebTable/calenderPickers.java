package dynamicWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderPickers {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://app.dev.empmonitor.com/");
	
	driver.findElement(By.id("amember-login")).sendKeys("empv3demo");
	driver.findElement(By.id("amember-pass")).sendKeys("empv3demo");
	driver.findElement(By.cssSelector("input[value='Login']")).click();
	
	driver.findElement(By.xpath("//a[text()='Skip']")).click();
	
	driver.findElement(By.xpath("//span[text()='Employee']")).click();
	
	driver.findElement(By.xpath("//a[text()='Employee-Details']")).click();
	
	driver.findElement(By.id("add_btn")).click();
	
	driver.findElement(By.xpath("//b[text()='Date of joining  ']/../following-sibling::div/input[@name='date']")).click();
	
	driver.findElement(By.xpath("//div[@role='calendar']//table/tbody/tr[2]/td[2]")).click();
	
}

}
