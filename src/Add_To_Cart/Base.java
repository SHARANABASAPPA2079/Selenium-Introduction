package Add_To_Cart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base

{

	public static void main(String[] args)

	{
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{
			// Brocolli - 1 Kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable Name
			// convert array into arraylist for east search
			// check whether name you extracted is present in that array list or not
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{
				j++;
				// click on add to cart
				driver.findElements(By.cssSelector(".product-action")).get(i).click();
				if (j == itemsNeeded.length)

				{
					break;
				}
			}
		}
	}

}
