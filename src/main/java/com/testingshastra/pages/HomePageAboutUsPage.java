package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.utility.WaitFor;

public class HomePageAboutUsPage {
	UIKeywords keywords = UIKeywords.getInstance();
	@FindBy(xpath = "//a[contains(text(),'About ')]")
	public WebElement about_us;

	public void clikcOnAboutUs() {
		new WaitFor();
		WaitFor.visibilityOfElement(about_us, 30);
		WaitFor.elementToBeClickableElement(about_us, 80);
		about_us.click();
	}

	public String getTitleOfThePage() {
		return keywords.getTitleOfPage();
	}

	public String getText() {
		return about_us.getText();
	}

}
