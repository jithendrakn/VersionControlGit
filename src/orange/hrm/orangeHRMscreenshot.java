package orange.hrm;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangeHRMscreenshot {

	@Test
	public void screenShot() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '_');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		
		
	}
}
