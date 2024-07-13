package Action_Class_Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Miscelleanous

{

	public static void main(String[] args) throws IOException 
	
	{
		ChromeOptions c = new ChromeOptions();
		c.setAcceptInsecureCerts(true);
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		c.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		c.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get("https://www.path2usa.com/travel-companions");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//we r casting driver object to the screenshot method object
		FileUtils.copyFile(src,new File("E:\\JavaPracticeLatest\\Introduction\\Drivers\\Screenshot.png"));//This will help us to see the screenshot visibly
		

	}

}
