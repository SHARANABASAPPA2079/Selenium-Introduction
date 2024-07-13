package TestNgTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo4 {

	@Parameters({"URL"})
	@Test(groups = {"Regression"})

	public void WebLoginHomeloan(String urlName)

	{
		System.out.println("Webh");
	System.out.println(urlName);
	}
	

	@Test

	public void MobileLoginHomeloan()

	{
		System.out.println("Mobileh");
	}

	@Test(groups = {"Smoke"})

	public void LoginApiHomeloan()

	{
		System.out.println("Apih");
	}

	@Test(groups = {"smoke"})
	public void LoginApiHomeloan1()

	{
		System.out.println("Apih1");
	}

	@Test(groups = {"Smoke"})
	public void LoginApiHomeloan2()

	{
		System.out.println("Apih2");
	}
}
