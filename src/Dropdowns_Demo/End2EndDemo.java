package Dropdowns_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndDemo {

	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Auto Suggestive Dropdown
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("Ind");
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item a"));
		for (WebElement option : options)

		{
			if (option.getText().equalsIgnoreCase("India"))

			{
				option.click();
				break;
			}
		}

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();// One Day Trip
		// Dynamic Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		// Calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{
			System.out.println("Its Disabled");
			Assert.assertTrue(true);
		}

		else

		{
			System.out.println("Its enabled");
			Assert.assertTrue(false);
		}
		// Updated Dropdown(Number of Passengers)
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1;
		while (i < 5)

		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		// Select Currencey
		WebElement cStaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select cDropdown = new Select(cStaticDropdown);
		cDropdown.selectByIndex(1);
		System.out.println(cDropdown.getFirstSelectedOption().getText());
		// CheckBox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// Search
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.close();

	}

}
