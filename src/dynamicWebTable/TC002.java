package dynamicWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://qavbox.github.io/demo/webtable/");
	
	WebElement table_2 = driver.findElement(By.id("table02"));
	List<WebElement> total_rows = table_2.findElements(By.xpath("//table[@id='table02']/tbody/tr"));
	System.out.println("total_rows : " + total_rows.size());
	List<WebElement> total_data = table_2.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
	System.out.println("total_data : " + total_data.size());
	WebElement bruno_Nash_Salary = table_2.findElement(By.xpath("//td[text()='Bruno Nash']/following-sibling::td[5]"));
	System.out.println("bruno_Nash_Salary : " + bruno_Nash_Salary.getText());
}
}
