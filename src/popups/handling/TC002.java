package popups.handling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("file:///C:/Users/JITHENDRA/Desktop/confirmationPopup.html");
	
	driver.switchTo().alert().dismiss();
	
	driver.manage().window().minimize();
	driver.quit();
}
}
