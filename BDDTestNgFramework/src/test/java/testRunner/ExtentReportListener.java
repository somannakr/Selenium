package testRunner;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener {
	public static ExtentHtmlReporter report=null;
	public static ExtentReports extent=null;
	public static ExtentTest test=null;
	
	public static ExtentReports SetUp() {
		String reportLocation="E:\\Selenium\\Workspace\\BDDTestNgFramework\\Reports\\Extent_Report.html";
		report= new ExtentHtmlReporter(reportLocation);
		report.config().setTheme(Theme.DARK);
		report.config().setDocumentTitle("My Test Report Document");
		report.config().setReportName("My Test Report");
		report.config().setEncoding("utf-8");
		report.start();
		System.out.println("My report Started##########");
		
		extent= new ExtentReports();		
		extent.attachReporter(report);
		extent.setSystemInfo("Application", "Youtube");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		System.out.println("System Info is set to my extent report##########");
		return extent;
		
	}
	
	public static void testStepHandle(String TestStatus, WebDriver driver, ExtentTest extentTest, Throwable throwable) 
	{
		/*switch(TestStatus) {
		case"FAIL":
			extentTest.fail(MarkupHelper.createLabel("Test case is failed", ExtentColor.RED));
			extentTest.error(throwable.fillInStackTrace());
			if (driver!=null) {
				driver.quit();
			}
			break;
		case"PASS":
			extentTest.pass(MarkupHelper.createLabel("Test case is Passed", ExtentColor.GREEN));
			break;
			
		default:
				break;
		}
		*/
		

		if(TestStatus.equalsIgnoreCase("FAIL")){
			extentTest.fail(MarkupHelper.createLabel("Test case is failed", ExtentColor.RED));
			extentTest.error(throwable.fillInStackTrace());
			if (driver!=null) {
				driver.quit();
			}
		}
			
			else if(TestStatus.equalsIgnoreCase("FAIL"))
			{
			extentTest.pass(MarkupHelper.createLabel("Test case is Passed", ExtentColor.GREEN));
			
			}
		
	}

}
