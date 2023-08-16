package orange.hrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class applyLeave {

	@Test
	public void apply() {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		driver.findElement(By.xpath("//a[text()='Apply']")).click();
		driver.findElement(By.xpath("//label[text()='Leave Type']/../following-sibling::div//i")).click();
		List<WebElement> leaveTypeDropdown = driver.findElements(By.xpath("//label[text()='Leave Type']/../following-sibling::div//i/../../following-sibling::div/div"));
		
		for(WebElement leaveType:leaveTypeDropdown) {
			String actualText = leaveType.getText();
		if(actualText.equals("CAN - Bereavement")) {
			leaveType.click();
		}
		
		driver.findElement(By.xpath("//button[text()=' Apply ']")).click();
	}
	}
}
