package com.hospiol.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hospiol.base.TestBase;
import com.hospiol.pageobjects.Loginpage;

public class Logintest extends TestBase {
	Loginpage lp;

	public Logintest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		lp = new Loginpage(driver);
	}

	@Test(priority = 1, description = "Validating the given url")
	public void verifygivenurl() {
		String givenurl = driver.getCurrentUrl();
		Assert.assertEquals("http://admin.hospiol.com/site/login", givenurl);
	}

	@Test(priority = 2, description = "Login functionality")
	public void validatelogin() {
		lp.Verifylogin();
	}

	@Test(priority = 3, description = "Login functionality url verification")

	public void validateurl() {
		lp.Verifylogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
