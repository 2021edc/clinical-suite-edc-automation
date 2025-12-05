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
	
	public void clickOnForm2Link() {
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

}
