package com.testingshastra.uitests.homepagetests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.pages.ContactSalesPage;
import com.testingshastra.pages.HomePage;
import com.testingshastra.utility.WaitFor;

public class ContactSalesTest extends BaseClass{
		UIKeywords keywords = UIKeywords.getInstance();
		String expectedTitle = "IJmeet";
		
		@Test
		public void verifyTitleOfContactSales() throws InterruptedException {
				keywords.launchURL("https://ijmeet.com/");
				ContactSalesPage csp= PageFactory.initElements(UIKeywords.driver, ContactSalesPage.class);
				csp.clickOnContactSalesTab();
				Thread.sleep(500);
				
				String actualURL = keywords.getCurrentURL();
				System.out.println(actualURL+"\t Title of page: "+keywords.getTitleOfPage());
				Assert.assertEquals(keywords.getTitleOfPage(), "IJmeet");
		}
		
		@Test
		public void validateContactSalesForm() throws InterruptedException {
			keywords.launchURL("https://ijmeet.com/");
			ContactSalesPage csp= PageFactory.initElements(UIKeywords.driver, ContactSalesPage.class);
			csp.clickOnContactSalesTab();
			Thread.sleep(500);
//			ContactSalesPage csp = new ContactSalesPage();
			//home.getTextOfLinks();
			keywords.enterText(csp.contactSales_userName, "Shailaja");
			keywords.enterText(csp.contactSales_userEmail, "shailaja_reddy@gmail.com");
			keywords.enterText(csp.contactSales_userMessage, "HI... This is Selenium Page Factory Demo");
			keywords.switchToFrameAt(0);
			WaitFor.visibilityOfElement(csp.contactSales_captcha_box, 1000);
			keywords.click(csp.contactSales_captcha_box);
			keywords.switchToDefaultContent();
			WaitFor.elementToBeClickableElement(csp.contactSales_submitButton, 500);
			Thread.sleep(1500);
		}		
}