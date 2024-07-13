package TestNgTutorial;

import org.testng.annotations.Test;

public class TestNgDemo 

{
	
	@Test
	public void Demo()
	
	{
		System.out.println("Hello world");
	}
	
	@Test
	
	public void secondTest()
	
	{
		System.out.println("bye");
	}
	//u can define multiple tests  from single class
	//u can trigger all these test from xml file
	//xml is heart of this testNg
	//u can modularize the test cases based upon on functionality and trigger them accordingly
	
	//Global environment variables incorporated through selenium
	//parameterizg with multiple data set by running test with multiple com
}
