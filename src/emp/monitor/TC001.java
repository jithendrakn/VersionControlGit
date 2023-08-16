package emp.monitor;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://app.dev.empmonitor.com/");
	
	driver.findElement(By.id("amember-login")).sendKeys("empv3demo");
	driver.findElement(By.id("amember-pass")).sendKeys("empv3demo");
	driver.findElement(By.cssSelector("input[value='Login']")).click();
	
	driver.findElement(By.xpath("//a[text()='Skip']")).click();
	
	driver.findElement(By.xpath("//span[text()='Employee']")).click();
	
	driver.findElement(By.xpath("//a[text()='Employee-Details']")).click();
	
	driver.findElement(By.id("add_btn")).click();
	
	driver.findElement(By.id("name")).sendKeys("jithendra");
	
	driver.findElement(By.id("f_name")).sendKeys("jitu");
	
	driver.findElement(By.id("emp_email")).sendKeys("jitukn@gmail.com");
	
	driver.findElement(By.id("passwd")).sendKeys("jitu#123");
	
	driver.findElement(By.id("c_passwd")).sendKeys("jitu#123");
	
	driver.findElement(By.id("telephone")).sendKeys("9632359842");
	
	driver.findElement(By.name("empCode")).sendKeys("17");
	
	WebElement listLocation = driver.findElement(By.xpath("//select[@id='locations-addEmp']"));
	Select listLoc=new Select(listLocation);
	listLoc.selectByVisibleText("Bangalore");
	
	driver.findElement(By.xpath("//select[@id='role-addEmp']/following-sibling::span//input")).click();
	driver.findElement(By.xpath("//li[text()='automation']")).click();
	
	WebElement departmentDropdown = driver.findElement(By.id("EmpReg_departments"));
	Select deptList=new Select(departmentDropdown);
	deptList.selectByValue("Testing");
	
/*	WebElement startDateCalender = driver.findElement(By.id("date_joinCalender"));
	driver.findElement(By.xpath("//div[@role='calendar']//table/tbody/tr[2]/td[2]")).click();*/
	
	driver.findElement(By.xpath("//b[text()='Date of joining  ']/../following-sibling::div/input[@name='date']")).click();
	driver.findElement(By.xpath("//div[@role='calendar']//table/tbody/tr[2]/td[2]")).click();
	
	WebElement timeZoneDropDown = driver.findElement(By.id("timeZoneAppend"));
	Select timeZone=new Select(timeZoneDropDown);
	timeZone.selectByVisibleText("(UTC +05:30) Kolkata, Asia");
	
	WebElement profilePicUpload = driver.findElement(By.id("f_upload"));
	profilePicUpload.sendKeys("C:\\Users\\JITHENDRA\\Desktop\\virat71century.jpg");
	//Runtime.getRuntime().exec("C:\\Users\\JITHENDRA\\Desktop\\fileUploadImgEmp.au3");
	
	WebElement shiftDropDown = driver.findElement(By.id("Shiftfilteradd"));
	Select shiftType=new Select(shiftDropDown);
	shiftType.selectByValue("147");
	
	WebElement superiorRolesDropDown = driver.findElement(By.id("add_role_id_to_get_managers"));
	Select roletType=new Select(superiorRolesDropDown);
	roletType.selectByVisibleText("automation ");
	
	driver.switchTo().frame("fc_widget");
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	
	WebElement click_X_icon = driver.findElement(By.xpath("//div[@id='ember123']//span[@class='icon-ic_close']"));
	jse.executeScript("arguments[0].click();", click_X_icon);
	
	driver.switchTo().parentFrame();
	
	//driver.findElement(By.xpath("//select[@id='addSelectedManagerList']/following-sibling::span//input")).click();
	//driver.findElement(By.xpath("//li[text()='SubhadipRay - Globussoft']")).click();
	
	driver.findElement(By.id("address")).sendKeys("kadagatur village , kolar taluk");
	
	driver.findElement(By.xpath("//button[text()=' Register Employee']")).submit();
	
	Thread.sleep(5000);
	
}
}
