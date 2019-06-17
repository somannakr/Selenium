package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;

//@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/java/features",
		plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucmber.json"},
		glue= {"stepDefinition"},
		monochrome=true
		//tags= {"test"}
		
		)

public class TestRunner {
	//public class TestRunner extends AbstractTestNGCucumberTests{
	private  TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun= true)
	public void setUp() {
		testNGCucumberRunner= new TestNGCucumberRunner(this.getClass());
	}
	@Test(dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	@AfterClass
	public void terDown() {
		testNGCucumberRunner.finish();
	}
	

}
