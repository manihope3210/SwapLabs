package com.swap.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//swap//feature", glue = "com.swap.stepdefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:Reports/Html_Report", "pretty", "json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extent_Report.html" })
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void myclass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}
}
