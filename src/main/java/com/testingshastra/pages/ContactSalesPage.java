package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIKeywords;

public class ContactSalesPage {
		UIKeywords keywords = UIKeywords.getInstance();
		
		@FindBy(css="#navbarContent > ul > li:nth-child(3) > a")
		public WebElement contactSalesLink;
		
		@FindBy(name="user_name")
		public WebElement contactSales_userName;
		
		@FindBy(name="user_email")
		public WebElement contactSales_userEmail;
		
		@FindBy(name="user_message")
		public WebElement contactSales_userMessage;
		
		@FindBy(className="recaptcha-checkbox-border")
		public WebElement contactSales_captcha_box;
		
		@FindBy(css="button[type='submit']")
		public WebElement contactSales_submitButton;
		
		public  ContactSalesPage() {
			PageFactory.initElements(UIKeywords.driver, this);
		}
		
		public String getContactSalesTitle() {
			return contactSalesLink.getText();
		}
		
		public void clickOnContactSalesTab() {
			String locatorType  = "css";
			String locatorValue = "#navbarContent > ul > li:nth-child(3) > a";
			WebElement element = keywords.getWebElement(locatorType, locatorValue);
			element.click();
		}
}