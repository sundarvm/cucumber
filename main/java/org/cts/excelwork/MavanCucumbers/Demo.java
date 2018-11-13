package org.cts.excelwork.MavanCucumbers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	static WebDriver driver;
	@Given("^the user is in guru login page$")
	public void the_user_is_in_guru_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\GreenTechnology\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
	}

	@When("^the user enter username and password$")
	public void the_user_enter_username_and_password() {
		driver.findElement(By.name("uid")).sendKeys("test");
	    driver.findElement(By.name("password")).sendKeys("test");
	}

	@Then("^verify user is in manager webpage$")
	public void verify_user_is_in_manager_webpage() {
	    driver.findElement(By.name("btnLogin")).click();
	}



}
