package com.hospiol.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hospiol.base.TestBase;
import com.hospiol.pageobjects.Appointmentadd;
import com.hospiol.pageobjects.Loginpage;

public class Appointmentaddtest extends TestBase {

	Loginpage lp;
	Appointmentadd apt;

	public Appointmentaddtest() {

		super();
	}

	@BeforeMethod

	public void setup() {

		intialization();
		lp = new Loginpage(driver);
		apt = new Appointmentadd(driver);
		lp.Verifylogin();

	}

	@Test

	public void verifyaddapntmnt() {

		apt.validateapnt();
	}

	@AfterMethod
	public void teardown() throws Throwable {

		Thread.sleep(3000);
		// driver.close();

	}

}
