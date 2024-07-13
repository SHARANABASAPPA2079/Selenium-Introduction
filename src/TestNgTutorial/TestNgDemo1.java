package TestNgTutorial;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo1 {

	@Test

	public void pLoan()

	{
		System.out.println("pLoan");
	}

	@BeforeTest
	//when u say bt ,so before executing any class files from this folder first that particular annotation will be executed
   //delete some records in data base
	public void prerequiste()

	{
		System.out.println("i wille be execute first");
	}
	
	@AfterTest
	public void lastExecution()
	
	{
		System.out.println("I will execute last");
	}
	
	@AfterSuite
	
	//this is generally used if you want to set some global environment variables to your framework
	public void AftersuiteExecution()
	
	{
		System.out.println("I am the number one from last");
	
	}

}
