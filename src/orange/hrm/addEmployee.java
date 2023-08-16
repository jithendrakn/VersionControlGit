package orange.hrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class addEmployee {

	@Test
	public void addEmp() {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Virat");
		driver.findElement(By.name("lastName")).sendKeys("Kohli");
		driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div/input")).sendKeys("18");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		driver.quit();
	}
}
