package Action_Class_Demo;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		ChromeOptions c = new ChromeOptions();
		c.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// selenium will not allow to identify these broken links so that some java
		// methods will call url and get the status code
		// step1--is to get all the urls tied upto the links using selenium
		// if status code is >400 that url is not working --links tied up to url is
		// broken

		String url = driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		conn.setRequestMethod("HEAD");

		conn.connect();// this method will do just like what you have done on your browser

		int responseCode = conn.getResponseCode();// it will give you the code of the response what you got

		System.out.println(responseCode);

	//-------------------------------------------------------------------

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();//it will store failure but not stop execution immediately

		for (WebElement link : links)

		{
			String url1 = link.getAttribute("href");
			HttpURLConnection conn1 = (HttpURLConnection) new URL(url1).openConnection();
			conn1.setRequestMethod("HEAD");
			conn.connect();
			int responseCode1 = conn.getResponseCode();
			System.out.println(responseCode1);
			a.assertTrue(responseCode1<400,"The link with text"+link.getText()+"is broken with code");
			
		}
		a.assertAll();
	}

}
