package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.utility.WaitFor;

public class HomePageAboutUsPage {
	UIKeywords keywords = UIKeywords.getInstance();

	@FindBy(css = "div.row.footer-last-view-support > div:nth-child(3) > ul > li:nth-child(1) > a")
	public WebElement about_us;

	public void clickOnAboutUs() throws InterruptedException {
//		WaitFor.visibilityOfElement(about_us, 500);
//		WaitFor.elementToBeClickableElement(about_us, 8000);
//		about_us.click();
		Thread.sleep(1500);
		keywords.click(about_us);
	}

	public String getTitleOfThePage() {
		return keywords.getTitleOfPage();
	}

	public String getText() {
		return about_us.getText();
	}
}