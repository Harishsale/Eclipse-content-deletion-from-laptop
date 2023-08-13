package com.hospiol.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hospiol.base.TestBase;
import com.hospiol.utils.Utilsfile;

public class Appointmentadd extends TestBase {

	@FindBy(xpath = "//span[text()='Appointment']")
	WebElement Appointment;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm addappointment']")
	WebElement Addappointment;

//	@FindBy(xpath = "//span[@id='select2-addpatient_id-container']")
//	WebElement srch;
//
//	@FindBy(xpath = "//input[@class='select2-search__field']")
//	WebElement search;

	@FindBy(name = "doctorid")
	WebElement doctor;

	@FindBy(id = "global_shift")
	WebElement shift;

	@FindBy(id = "datetimepicker")
	WebElement date;

	@FindBy(id = "slot")
	WebElement slots;

	@FindBy(xpath = "//select[@class='form-control select2 appointment_priority_select2 select2-hidden-accessible']")
	WebElement priority;

	@FindBy(id = "note")
	WebElement patientnote;

	@FindBy(id = "formaddbtn")
	WebElement savebtn;

	public Appointmentadd(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void validateapnt() {

		Appointment.click();
		Addappointment.click();

//		srch.click();
//
//		search.sendKeys("289");
//		search.sendKeys(Keys.ENTER);

		Utilsfile.dropdown(doctor, "8");
		Utilsfile.dropdown(shift, "1");
		//date.click();
		//date.clear();
		date.sendKeys("08/14/2023 2:30 PM");
		date.sendKeys(Keys.ENTER);
		Utilsfile.dropdown(slots, "2174");
		Utilsfile.dropdown(priority, "3");
		patientnote.sendKeys("NA");
		savebtn.click();

	}

}
