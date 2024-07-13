package Dropdowns_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns

{

	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		// Dynamic drop down with index(Xpth)
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// Dynamic dropdown with parent-child relationship xpath
		// div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		
		
		//Calendar
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	
	
	}

}
