package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIKeywords;

public class JoinMeetingPage {
	UIKeywords keywords = UIKeywords.getInstance();

	/*
	 * @Test public void verifyTitleOfHomePage() { String expectedTitle = "IJMeet";
	 * Assert.assertEquals(keywords.driver.getTitle(), expectedTitle); }
	 * 
	 * @Test public void verifyUserRedirectsToJoinMeetingPage() { HomePage home =
	 * new HomePage(); home.clickOnJoinMeetingTab(); String actualURL =
	 * keywords.getCurrentURL(); Assert.assertTrue(actualURL.contains("")); }
	 */

	@FindBy(css = "div.joinmeeting")
	public WebElement quickJoinMeeting;

//	public By quickJoinMeetingTitle = By.cssSelector("div#navbarContent li:nth-child(1)");

	public JoinMeetingPage() {
		PageFactory.initElements(UIKeywords.driver, this);
	}
	
	public String getQuickJoinMeetingTitle() {
		return quickJoinMeeting.getText();
//		return keywords.driver.findElement(quickJoinMeetingTitle).getText();
	}
}