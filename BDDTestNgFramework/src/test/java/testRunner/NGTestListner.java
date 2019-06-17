package testRunner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.gherkin.model.Feature;



public class NGTestListner extends ExtentReportListener implements ITestListener {
	
	private static ExtentReports extent;
//	ExtentReportUtil ex=new ExtentReportUtil();
//	@BeforeClass(alwaysRun= true)
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test start");
	//	ex.ExtentReport();
		//feature
	//	features=ex.extent.createTest(Feature.class, "login feature");
				
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test sucess");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Fail");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skip");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test Failed But Within Success Percentage");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test onstart");
		extent=SetUp();
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
				System.out.println("Test Finish");
				extent.flush();
				System.out.println("Report Generated#######");
	}

}
