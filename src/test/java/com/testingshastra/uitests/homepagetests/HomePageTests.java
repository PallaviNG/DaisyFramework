package com.testingshastra.uitests.homepagetests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.JoinMeetingPage;

@Test
public class HomePageTests extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	String expectedTitle = "Testing Shastra | Training | Placement";

//	public void verifyTitleOfHomePage() {
//		keyword.launchURL("https://testingshastra.com");
//		String actualTitle = keyword.getTitleOfPage();
//		Assert.assertEquals(actualTitle, expectedTitle);
//	}

	@Test
	public void verifyUserRedirectsToJoinMeetingPage() throws InterruptedException {
		keyword.launchURL("https://ijmeet.com/");
//		HomePage home = new HomePage();
		HomePage home = PageFactory.initElements(UIKeywords.driver, HomePage.class);
		home.rightClickOnNavBar();
		Thread.sleep(2000);
		home.clickOnJoinMeetingTab();
		JoinMeetingPage joinMeeting = PageFactory.initElements(UIKeywords.driver, JoinMeetingPage.class);
		String actualTitle = joinMeeting.getQuickJoinMeetingTitle();
		Assert.assertTrue(actualTitle.contains("Quick"));
		System.out.println("Passed (testing purpose)");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void printAllInfoLinks() {
		keyword.launchURL("https://ijmeet.com/");
		HomePage home = new HomePage();
		home.getTextOfLinks();
		System.out.println("Hello");
		System.out.println("Another Change...");
	}
}
