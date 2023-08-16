package orange.hrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class loginPage {
	
@Test
public static void search() {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
	driver.findElement(By.xpath("//label[text()='Employee Name']/../..//input[@placeholder=\"Type for hints...\"]")).sendKeys("Cecil");
	driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div/input")).sendKeys("0204");
	driver.findElement(By.xpath("//label[text()='Employment Status']/../following-sibling::div//i")).click();
	driver.findElement(By.xpath("//label[text()='Employment Status']/../following-sibling::div//div[@role='option']//span[text()='Full-Time Permanent']")).click();
	driver.findElement(By.xpath("//label[text()='Include']/../following-sibling::div//i")).click();
	driver.findElement(By.xpath("//label[text()='Include']/../following-sibling::div/div/div[@role='listbox']//span[text()='Current Employees Only']")).click();
	driver.findElement(By.xpath("//label[text()='Supervisor Name']/../following-sibling::div//input")).sendKeys("Fiona Grace");
	driver.findElement(By.xpath("//label[text()='Job Title']/../following-sibling::div//i")).click();
	driver.findElement(By.xpath("//label[text()='Job Title']/../following-sibling::div//div[@role='listbox']/div/span[text()='Software Engineer']")).click();
	driver.findElement(By.xpath("//label[text()='Sub Unit']/../following-sibling::div//i")).click();
	driver.findElement(By.xpath("//label[text()='Sub Unit']/../following-sibling::div/div/div[@role='listbox']//span[text()='Development']")).click();
	driver.findElement(By.xpath("//button[text()=' Search ']")).click();
}
}
