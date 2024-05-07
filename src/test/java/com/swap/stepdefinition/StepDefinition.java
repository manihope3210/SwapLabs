package com.swap.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swap.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	public static WebDriver driver = Test_Runner.driver;
	

	
	@Given("^user Launch The SwapLabs Application$")
	public void user_Launch_The_SwapLabs_Application() throws Throwable {
      driver.get("https://www.saucedemo.com/");

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
       WebElement username = driver.findElement(By.xpath("//input[@name='user-name']"));
       username.sendKeys("standard_user");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("secret_sauce");

	}

	@Then("^user Click The Login Button And Its Navigate to Product Pages$")
	public void user_Click_The_Login_Button_And_Its_Navigate_to_Product_Pages() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@name='login-button']"));
		login.click();
	
	}

	@Given("^user Select Product To Add To Cart$")
	public void user_Select_Product_To_Add_To_Cart() throws Throwable {
		WebElement add = driver.findElement(By.xpath("(//a[@class='shopping_cart_link'])[1]"));
		add.click();
	}

	@Then("^user Click The Your Add Cart And Its Navigate To Add Cart page$")
	public void user_Click_The_Your_Add_Cart_And_Its_Navigate_To_Add_Cart_page() throws Throwable {
		WebElement checkOut = driver.findElement(By.xpath("//button[@name='checkout']"));
		checkOut.click();

	}

	@Then("^user Select The Add Cart For The All Products Checking To Checkout page$")
	public void user_Select_The_Add_Cart_For_The_All_Products_Checking_To_Checkout_page() throws Throwable {
//		WebElement selectProduct = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
//		selectProduct.click();
		
	}

	@When("^user Enter The FirstName In FirstName Field$")
	public void user_Enter_The_FirstName_In_FirstName_Field() throws Throwable {
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstName']"));
		fName.sendKeys("ManiSrii");

		
		


	}

	@When("^user Enter The LastName In LastName Field$")
	public void user_Enter_The_LastName_In_LastName_Field() throws Throwable {
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lName.sendKeys("Sakthi");
	}

	@When("^user Enter The PostalCode In PostalCode Field$")
	public void user_Enter_The_PostalCode_In_PostalCode_Field() throws Throwable {
		WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalCode.sendKeys("62000028");
	}

	@Then("^user Click The Continue Button And Its Navigate To Checkout Overview Confiromation Page$")
	public void user_Click_The_Continue_Button_And_Its_Navigate_To_Checkout_Overview_Confiromation_Page() throws Throwable {
		WebElement checkoutProduct = driver.findElement(By.xpath("//input[@name='continue']"));
		checkoutProduct.click();
		}

	@Then("^user Click To Finsih Button And Its To Navigate To Checkout Complete Page$")
	public void user_Click_To_Finsih_Button_And_Its_To_Navigate_To_Checkout_Complete_Page() throws Throwable {
     WebElement finalProduct = driver.findElement(By.xpath("//button[@name='finish']"));
     finalProduct.click();
	}

	@Then("^user Click To Back Home Button And Its Navigate To SwapLaps Login Page$")
	public void user_Click_To_Back_Home_Button_And_Its_Navigate_To_SwapLaps_Login_Page() throws Throwable {
		WebElement backToHome = driver.findElement(By.xpath("//button[@name='back-to-products']"));
		backToHome.click();

	}


}
