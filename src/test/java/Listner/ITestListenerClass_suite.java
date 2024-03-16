package Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ITestListenerClass_suite extends TestListenerAdapter {

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
		System.out.println("git hub start");
		System.out.println("git hub start1");
		System.out.println("git hub start12");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		System.out.println("for git purpose");
		System.out.println("for git purpos1555e");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		System.out.println("sachin ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}
}
