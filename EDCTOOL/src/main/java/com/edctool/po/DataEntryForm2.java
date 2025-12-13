package com.edctool.po;

import java.time.LocalDate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edctool.utils.AssertUtils;
import com.edctool.utils.SeleniumActions;

public class DataEntryForm2 extends SeleniumActions {

	public DataEntryForm2() {
		PageFactory.initElements(getDriver(), this);
	}

	AssertUtils assertUtils = new AssertUtils();

	@FindBy(css = "div.form-row.p-2")
	private WebElement lnkForm2;

	@FindBy(css = "p.heading")
	private WebElement lblHeading;

	@FindBy(name = "V1_DT")
	private WebElement dateCalander;

	@FindBy(css = "span.ngb-dp-day")
	private List<WebElement> dateOption;

	@FindBy(css = "#unknownDate-0")
	private WebElement chkUnknownDate;

	@FindBy(css = "div.col-12.col-lg")
	private WebElement unknownDateDropdown;

	@FindBy(css = "#date")
	private WebElement dateDropdown;

	@FindBy(css = "#month")
	private WebElement monthDropdown;

	@FindBy(css = "#year")
	private WebElement yearDropdown;

	@FindBy(css = "span:nth-child(2) button.mb-1")
	private WebElement btnSubmitForReview;

	@FindBy(xpath = "(//select[@id='155819'])[1]")
	private WebElement ddlHrs;

	@FindBy(xpath = "//div[@id='155819']//div[2]//select[1]")
	private WebElement ddlMinutes;

	@FindBy(xpath = "//select[@id='24hours-155820']")
	private WebElement ddl24Hrs;

	@FindBy(xpath = "//select[@id='155820']")
	private WebElement ddl24Mins;

	@FindBy(xpath = "//div[@id='155821']//div[@class='row ps-2']//div[1]//div[1]//select[1]")
	private WebElement ddlHrsForTimeWithSec;

	@FindBy(xpath = "//div[@id='155821']//div[2]//div[1]//select[1]")
	private WebElement ddlMinsForTimeWithSec;

	@FindBy(xpath = "//div[@class='row mb-2 bg-white field-normal-border data-entry-row-border data-entry-row-border--query']//div[3]//div[1]//select[1]")
	private WebElement ddlSecForTimeWithSec;

	@FindBy(xpath = "//div[@class='row mb-2 bg-white field-normal-border data-entry-row-border data-entry-row-border--query']//div[4]//div[1]//select[1]")
	private WebElement ddlAMPMForTimeWithSec;

	@FindBy(css = "[name='V1_Date time']")
	private WebElement dateTime;

	@FindBy(xpath = "//select[@id='12hours']")
	private WebElement dateTimeHrs;

	@FindBy(xpath = "//select[@id='12minutes']")
	private WebElement dateTimeMins;

	public void clickOnForm2Link() {
		staticWait(2);
		clickOnElement(lnkForm2);
	}

	public void verifyHeading() {
		assertUtils.isElementDisplayed(lblHeading);
	}

	public int getTodayDate() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}

	public void clickOnDate() {
		clickOnElement(dateCalander);

		selectValueFromList(dateOption, String.valueOf(getTodayDate()));
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

	public void selectHrsTime12WithSec(String hrs) {
		staticWait(2);
		selectValueFromDropdown(ddlHrsForTimeWithSec, hrs);
	}

	public void selectMinsTime12WithSec(String mins) {
		selectValueFromDropdown(ddlMinsForTimeWithSec, mins);
	}

	public void selectSecTime12WithSec(String sec) {
		selectValueFromDropdown(ddlSecForTimeWithSec, sec);
	}

	public void selectAMPMTime12WithSec(String AMPM) {
		selectValueFromDropdown(ddlAMPMForTimeWithSec, AMPM);
	}

	public void verifyMaxHrsForTime12HrsWithSec(String hrs) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddlHrsForTimeWithSec, hrs);
	}

	public void verifyMaxMinsForTime12HrsWithSec(String mins) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddlMinsForTimeWithSec, mins);
	}

	public void verifyMaxSecForTime12HrsWithSec(String sec) {
		staticWait(2);
		assertUtils.verifyMaxValueInDropdown(ddlSecForTimeWithSec, sec);
	}

	public void verifyMinHrsForTime12HrsWithSec(String hrs) {
		staticWait(2);
		assertUtils.verifyMinValueInDropdown(ddlHrsForTimeWithSec, hrs);
	}

	public void verifyMinMinsForTime12HrsWithSec(String mins) {
		staticWait(2);
		assertUtils.verifyMinValueInDropdown(ddlMinsForTimeWithSec, mins);
	}

	public void verifyMinSecForTime12HrsWithSec(String sec) {
		staticWait(2);
		assertUtils.verifyMinValueInDropdown(ddlSecForTimeWithSec, sec);
	}

	public void clickOnDateTime() {
		clickOnElement(dateTime);

		selectValueFromList(dateOption, String.valueOf(getTodayDate()));
	}

	public void selectHrsDateTime(String mins) {
		selectValueFromDropdown(ddlMinsForTimeWithSec, mins);
	}

	public void selectMinsDateTime(String sec) {
		selectValueFromDropdown(ddlSecForTimeWithSec, sec);
	}

	public void verifyNextDateDisableAndNotClickable() {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		int nextDay = tomorrow.getDayOfMonth();

		clickOnElement(dateTime);

		String xpath = "//div[@role='gridcell' and contains(@class,'disabled')]" + "//span[text()='" + nextDay + "']";

		WebElement parentCell = getDriver().findElement(By.xpath(xpath + "/parent::div"));

		String classAttr = parentCell.getAttribute("class");
		boolean isDisabled = classAttr.contains("disabled");

		if (!isDisabled) {
			throw new AssertionError("Next date " + nextDay + " is NOT disabled but it should be.");
		}

		try {
			parentCell.click();
			throw new AssertionError("Next date " + nextDay + " was clickable, it should not be.");
		} catch (InvalidElementStateException e) {
			
		}
	}
}
