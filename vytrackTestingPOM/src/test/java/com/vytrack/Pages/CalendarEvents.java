package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarEvents extends LoginPage {
	@FindBy (linkText = "Create Calendar Event")
	public WebElement createCalendarEvents;
	
	@FindBy(xpath = "//input[starts-with(@id,'date_selector_oro_calendar_event_form_start-uid')]")
	public WebElement startDate;
	
	@FindBy(xpath = "//input[starts-with(@id,'date_selector_oro_calendar_event_form_end-uid-')]")
	public WebElement endDate;
	
	@FindBy(xpath = "//input[starts-with(@id,'time_selector_oro_calendar_event_form_start-uid')]")
	public WebElement startTime;
	
	@FindBy(xpath = "//input[starts-with(@id,'time_selector_oro_calendar_event_form_end-uid')]")
	public WebElement endTime;
	
	@FindBy(xpath = "//li[contains(@class,'ui-timepicker')]")
	public WebElement times;
	
	
	@FindBy (xpath = "//input[contains(@id,'recurrence-repeat-view')]")
	public WebElement repeat;
	
	@FindBy (xpath = "//select[contains(@id,'recurrence-repeats-view')]")
	public WebElement repeatsList;
	
	@FindBy (xpath = "(//input[@type='radio'])[1]")
	public WebElement RepeatEveryButton;
	
	@FindBy (xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
	public WebElement repeatBox;
	
	@FindBy(xpath = "//span[contains(text(),'Daily')][contains(text(),'every')]")
	public WebElement summary;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	public WebElement RepeatWeekdayButton;
	
	@FindBy (xpath = "//button[contains(text(),'Today')]")
	public WebElement today;
	
	@FindBy (xpath = "//span[contains(text(),'The value have not to be')]")
	public WebElement errorMsgOverLimitDays;
	
	public  List< WebElement> getTimes(){
		return Driver.get().findElements(By.xpath("//li[contains(@class,'ui-timepicker')]"));
	}

}
