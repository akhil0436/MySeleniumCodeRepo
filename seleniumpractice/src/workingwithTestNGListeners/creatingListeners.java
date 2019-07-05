package workingwithTestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class creatingListeners implements ITestListener
{

	@Override
	public void onFinish(ITestContext result) {
		
		System.out.println("the Test case is on Finish"+"    "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("the Test case is on Start"+"    "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("the Test case is on Test Failed But With in Success Percentage"+"    "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("the Test case is on Test Failure"+"    "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("the Test case is on Test Skipped"+"    "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("the Test case is on Test Start"+"    "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("the Test case is on Test Success"+"    "+result.getName());
		
	}

	
	
}
