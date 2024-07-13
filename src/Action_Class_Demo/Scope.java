package Action_Class_Demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		// give me the count of links on the page

		System.out.println(driver.findElements(By.tagName("a")).size());

		// How do u count the links in footer

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// count the links in footer section of first column

		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		// click on each link of the column and check if pages are opening
		// how to open the links in separate tabs -optimized solution.

		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++)

		{
			String clickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);// this will help us open separate tab
			columnDriver.findElement(By.tagName("a")).sendKeys(clickonLinkTab);

			// get the title of the child tabs with optimized

			Set<String> abc = driver.getWindowHandles();

			Iterator<String> it = abc.iterator();

			while (it.hasNext())

			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		}

	}

}
