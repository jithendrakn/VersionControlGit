package dynamicWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.moneycontrol.com/stocks/marketstats/nsemact1/index.php");
	
	WebElement cnxNiftyTable = driver.findElement(By.xpath("//div[@id='data_table_ajax_loading']/../table"));
	List<WebElement> total_Body_Rows = cnxNiftyTable.findElements(By.xpath("//div[@id='data_table_ajax_loading']/../table/tbody/tr"));
	System.out.println(total_Body_Rows.size());
	
	
}
}
