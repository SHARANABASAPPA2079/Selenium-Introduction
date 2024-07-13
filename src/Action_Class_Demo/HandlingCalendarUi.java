package Action_Class_Demo;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingCalendarUi

{

	public static void main(String[] args)

	{

		ChromeOptions c = new ChromeOptions();
		c.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companions");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();

		// driver.findElement(By.xpath("//div[@class='flatpickr-month']/div[@class='flatpickr-current-month']")).getText().contains("May");
		while (!driver.findElement(By.xpath("//div[@class='flatpickr-month']/div[@class='flatpickr-current-month']"))
				.getText().contains("March"))

		{
			driver.findElement(By.xpath("//div[@class='flatpickr-month']/span[@class='flatpickr-next-month']")).click();
		}

		List<WebElement> hdates = driver
				.findElements(By.xpath("//div[@class='flatpickr-days']/div[@class='dayContainer']/span"));
		int cdays = driver.findElements(By.xpath("//div[@class='flatpickr-days']/div[@class='dayContainer']/span"))
				.size();
		for (int i = 0; i < cdays; i++) {
			String text = driver
					.findElements(By.xpath("//div[@class='flatpickr-days']/div[@class='dayContainer']/span")).get(i)
					.getText();
			if (text.equalsIgnoreCase("29")) {
				driver.findElements(By.xpath("//div[@class='flatpickr-days']/div[@class='dayContainer']/span")).get(i)
						.getText();
				break;
			}
		}

	}

}
