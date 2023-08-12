package com.hospiol.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hospiol.base.TestBase;

public class Loginpage extends TestBase {

	@FindBy(xpath = "(//a[text()='Admin login '])[1]")
	WebElement AdminLogin;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@class='btn']")
	WebElement buttonClick;

	public Loginpage() {

		PageFactory.initElements(driver, this);
	}

	public Homepage Verifylogin() {

		AdminLogin.click();
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		buttonClick.click();

		return new Homepage();
	}

	public String Urltest() {

		String applicationurl = driver.getCurrentUrl();
		return applicationurl;
	}

}
