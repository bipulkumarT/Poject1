package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	System.out.println("I successfully executed Listeners Pass code" + result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("I failed successfully"+result.getName());
	}


}
