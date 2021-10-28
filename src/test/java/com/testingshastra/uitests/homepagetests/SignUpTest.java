package com.testingshastra.uitests.homepagetests;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.utility.Locator;
import com.testingshastra.utility.TestListener;
import com.testingshastra.utility.WaitFor;

@Listeners(TestListener.class)
public class SignUpTest extends BaseClass{
	private static final Logger LOG = Logger.getLogger(SignUpTest.class); 
		UIKeywords keyword = UIKeywords.getInstance();

		@Test
		public void validateFullNameFieldForCorrectInput() {
				String url = "https://ijmeet.com/";
				keyword.launchURL(url);
				LOG.info("URL is launched"+url);
				
//				WebElement signUp = keyword.getDriver().findElement(By.cssSelector("li:nth-child(5) a.nav-link"));
			
//				keyword.click(signUp);
				keyword.click("css","li:nth-child(5) a.nav-link");
				DailyRollingFileAppender f;
				
				/*
				keyword.enterText("css", "input#name"	, "Deepak Shinde");
				keyword.enterText("css", "input#company_name","Testing Shastra");
				keyword.enterText("css", "input#email","deepak@gmail.com");
				keyword.enterText("css", "input#contact","9325493115");
				keyword.enterText("css", "input#password","abc@123");*/
				
				keyword.enterText(Locator.SIGNUP_FULLNAME	, "Deepak Shinde");
				keyword.enterText(Locator.SIGNUP_COMPANYNAME,"Testing Shastra");
				keyword.enterText(Locator.SIGNUP_EMAILID,"deepak@gmail.com");
				keyword.enterText(Locator.SIGNUP_CONTACT,"9325493115");
				keyword.enterText(Locator.SIGNUP_PASSWORD,"abc@123");
				
				
				
				keyword.switchToFrameAt(0);
//				keyword.click("css","div.recaptcha-checkbox-border");
				WebElement element = keyword.getWebElement("css", "div.recaptcha-checkbox-border");
				WaitFor.visibilityOfElement(element, 2000);
				keyword.click(element);
				keyword.switchToDefaultContent();
				
				LOG.info("captcha is verified");
			
				try {
					Thread.sleep(35000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				WebElement element1 = keyword.getWebElement("css", "button[type='submit']");
				WaitFor.elementToBeClickableElement(element1, 5000);
//				keyword.click("css","button[type='submit']");
				keyword.click(element1);
				
				LOG.info("form is submitted");
				
				try {
					Thread.sleep(7500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String actualURL=keyword.getCurrentURL();
				System.out.println(actualURL);
				Assert.assertTrue(actualURL.contains("dashboard"));
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
}
