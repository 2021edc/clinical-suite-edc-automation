package com.edctool.po;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class SubjectVisitForm2 extends SeleniumActions {
	
	public SubjectVisitForm2() {
		PageFactory.initElements(getDriver(), this);
	}
	
	AssertUtils assertUtils = new AssertUtils();
	
	@FindBy(css="div.form-row.p-2")
	private WebElement lnkForm2;
	
	@FindBy(css="p.heading")
	private WebElement lblHeading;
	
	@FindBy(name="V1_DT")
	private WebElement dateCalander;
	
	@FindBy(css="span.ngb-dp-day")
	private List<WebElement> dateOption;
	
	@FindBy(css="#unknownDate-0")
	private WebElement chkUnknownDate;
	
	@FindBy(css="div.col-12.col-lg")
	private WebElement unknownDateDropdown;
	
	@FindBy(css="#date")
	private WebElement dateDropdown;
	
	@FindBy(css="#month")
	private WebElement monthDropdown;
	
	@FindBy(css="#year")
	private WebElement yearDropdown;
	
	@FindBy(css="span:nth-child(2) button.mb-1")
	private WebElement btnSubmitForReview;
	
	@FindBy(xpath="(//select[@id='155819'])[1]")
	private WebElement ddlHrs;
	
	@FindBy(xpath="//div[@id='155819']//div[2]//select[1]")
	private WebElement ddlMinutes;
	
	@FindBy(xpath="//select[@id='24hours-155820']")
	private WebElement ddl24Hrs;
	
	@FindBy(xpath="//select[@id='155820']")
	private WebElement ddl24Mins;
	
	public void clickOnForm2Link() {
		staticWait(2);
		clickOnElement(lnkForm2);
	}
	
	public void verifyHeading() {
		assertUtils.isElementDisplayed(lblHeading);
	}
	
	public void clickOnDate() {
		LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        
        clickOnElement(dateCalander);
        
        selectValueFromList(dateOption, String.valueOf(day));
	}
	
	public void clickOnUnknownDate() {
		clickOnElement(chkUnknownDate);
	}
	
	public void verifyUnknownDateDropdown() {
		assertUtils.isElementDisplayed(unknownDateDropdown);
	}
	
	public void clickOnDate(String date) {
		selectValueFromDropdown(dateDropdown, date);
	}
	
	public void clickOnMonth(String month) {
		selectValueFromDropdown(monthDropdown, month);
	}
	
	public void clickOnYear(String year) {
		selectValueFromDropdown(yearDropdown, year);
	}

	public void verifySubmitForReview() {
		assertUtils.isElementDisplayed(btnSubmitForReview);
	}
	
	public void selectHrs(String hrs) {
		staticWait(3);
		selectValueFromDropdown(ddlHrs, hrs);
	}
	
	public void selectMinutes(String minutes) {
		selectValueFromDropdown(ddlMinutes, minutes);
	}
	
	public void verifyMaxHrs(String hrs) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddlHrs, hrs);
	}
	
	public void verifyMaxMins(String mins) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddlMinutes, mins);
	}
	
	public void selectTime24Hrs(String hrs) {
		staticWait(3);
		selectValueFromDropdown(ddl24Hrs, hrs);
	}
	
	public void selectTime24Minutes(String minutes) {
		selectValueFromDropdown(ddl24Mins, minutes);
	}
	
	public void verifyTime24MaxHrs(String hrs) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddl24Hrs, hrs);
	}
	
	public void verifyTime24MaxMins(String mins) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddl24Mins, mins);
	}
}
