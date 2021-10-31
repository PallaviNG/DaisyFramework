package com.testingshastra.uitests.homepagetests;

import org.openqa.selenium.JavascriptExecutor;

//import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.pages.HomePageAboutUsPage;

public class HomePageAboutUsTest extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();

	@Test
	public void clickOnAboutUs() throws InterruptedException {
		keyword.launchURL("https://ijmeet.com");
		// UIKeywords.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		HomePageAboutUsPage about = PageFactory.initElements(UIKeywords.driver, HomePageAboutUsPage.class);
		
		JavascriptExecutor js = (JavascriptExecutor) keyword.driver;
		js.executeScript("window.scrollBy(0,1850)", "");
		
		System.out.println("Text>>>:" + about.getText());
		System.out.println(about.getTitleOfThePage());
		about.clickOnAboutUs();
	}
}