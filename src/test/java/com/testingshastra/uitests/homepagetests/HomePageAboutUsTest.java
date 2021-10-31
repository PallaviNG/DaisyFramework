package com.testingshastra.uitests.homepagetests;



//import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.pages.HomePageAboutUsPage;

public class HomePageAboutUsTest extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
@Test
	public <about_us> void clickOnAboutUs() {
		keyword.launchURL("https://ijmeet.com");
		//UIKeywords.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		HomePageAboutUsPage about=  PageFactory.initElements(UIKeywords.driver, HomePageAboutUsPage.class);
		
		System.out.println("Text>>>:"+ about.getText());
	System.out.println(about.getTitleOfThePage());
	//about.clikcOnAboutUs() ;
}
}
