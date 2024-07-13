package TestNgTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo3 {

	@Parameters({"URL"})
	@Test

	public void webLoginCarloan(String urlName)

	{
		System.out.println("web car");
		System.out.println(urlName);
	}

	@Test(dataProvider = "getData")

	public void MobileLogincarLoan(String username, String password)

	{
		System.out.println("Mob Car");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeSuite

	public void Bfsuite()

	{
		System.out.println("I am Number one");
	}

	@BeforeMethod
	// it is specific to class file
	public void beforererecovery()

	{
		System.out.println("I will be execute before every test method in TestNgDemo3 Class");
	}

	@Test

	public void MobileLogincarLoan1()

	{
		System.out.println("Mob Car1");
	}

	@Test(timeOut = 4000)

	public void MobileLogincarLoan2()

	{
		System.out.println("Mob Car2");
	}

	@Test

	public void LoginApiCarloan()

	{
		System.out.println("Api car");
	}

	@AfterMethod
	// it is specific to class file
	public void Afterrerecovery()

	{
		System.out.println("I will be execute After every test method in TestNgDemo3 Class");
	}

	@DataProvider
	public Object[][] getData()

	{
		// 1st combination -username and password- good credit history
		// 2nd combination username and password no credit history
		// 3rd combination fraudent credit history

		Object data[][] = new Object[3][2];
		// 1st set
		data[0][0] = "firstUsername";
		data[0][1] = "firstPassword";

		// 2nd set

		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		// 3rd set
		data[2][0] = "thirdUsername";
		data[2][1] = "thirdpassword";

		return data;
	}

}
