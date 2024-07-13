package TestNgTutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
//Testng Listener ==Name it self says there are some listeners where it will activate after your test or before your test

public class Listeners implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) 
	
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("I successfully Executed listener pass code ");
	}

	@Override
	public void onTestFailure(ITestResult result)
	
	{
		//Screenshot code
		//response if APU failed
		System.out.println("I successfully Executed  but listener pass code fail "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	
	{
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	
	{
				
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	
	{
		
	}

}
