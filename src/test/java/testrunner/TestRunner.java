package testrunner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/DSAlgoSignin.feature"},
        glue = {"stepdefinition","hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
	return super.scenarios();
	}


	}