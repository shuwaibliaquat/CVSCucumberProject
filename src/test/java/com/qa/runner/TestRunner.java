package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\main\\java\\com\\qa\\features\\homePage.feature" ,
				"src\\main\\java\\com\\qa\\features\\logIn.feature",
				"src\\main\\java\\com\\qa\\features\\registration.feature"},
		
		//the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
	 	strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)
  


public class TestRunner extends AbstractTestNGCucumberTests  {//AbstractTestNGCucumberTests-comes from testNGCucumber Dependency for TestNG.xml execution for maven test using jenkins or control panel

}
