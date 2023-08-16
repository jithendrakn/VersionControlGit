package dynamicWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	WebElement table = driver.findElement(By.id("countries"));
	List<WebElement> total_rows = table.findElements(By.xpath("//table/tbody/tr"));
	System.out.println("total_rows : " +total_rows.size());
	List<WebElement> total_data = table.findElements(By.xpath("//table/tbody/tr[2]/td"));
	System.out.println("total_data : " +total_data.size());
	
	driver.findElement(By.xpath("//strong[text()='Afghanistan']/../preceding-sibling::td/input")).click();
	driver.findElement(By.xpath("//strong[text()='India']/../preceding-sibling::td/input")).click();
	driver.findElement(By.xpath("//strong[text()='United States of America']/../preceding-sibling::td/input")).click();
}
}
