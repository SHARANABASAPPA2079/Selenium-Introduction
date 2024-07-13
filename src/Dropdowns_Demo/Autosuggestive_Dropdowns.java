package Dropdowns_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdowns

{

	public static void main(String[] args)

	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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

	}

}
