package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class usageOfisEnabled {

	@Test
	public void enabled() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement userNameTextField = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		String usernameTextAttValue = userNameTextField.getAttribute("value");
		System.out.println("usernameTextAttValue : " + usernameTextAttValue);
		if(usernameTextAttValue.isEmpty()) {
			System.out.println("pass: username text field empty");
		}
		else {
			System.out.println("Fail : username text field is not empty");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
