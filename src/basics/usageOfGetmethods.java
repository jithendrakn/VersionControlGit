package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class usageOfGetmethods {

	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("actualURL : " + actualURL);
		
		String title=driver.getTitle();
		System.out.println("tittle : " + title);
		
		String wid = driver.getWindowHandle();
		System.out.println("window id : " + wid);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
