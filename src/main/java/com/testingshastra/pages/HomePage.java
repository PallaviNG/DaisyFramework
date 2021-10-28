package com.testingshastra.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIKeywords;

public class HomePage {

	UIKeywords keywords = UIKeywords.getInstance();

	public HomePage() {
		PageFactory.initElements(UIKeywords.driver, this);
	}

	public void clickOnJoinMeetingTab() {
		String locatorType = "xpath";
//		String locatorValue = "#navbarContent > ul > li:nth-child(1) > a";
		String locatorValue = "//*[@id=\"navbarContent\"]/ul/li[1]/a";
		WebElement element = keywords.getWebElement(locatorType, locatorValue);
		keywords.click(element);
	}

	@CacheLookup
	@FindBy(css = "div#navbarContent li:nth-child(1)")
	public WebElement joinMeetingTab;
//	public By quickJoinMeetingTitle = By.cssSelector("div#navbarContent li:nth-child(1)");
	
	@FindBy(css="div.footer-last-view-support div:nth-child(3) li a")
	public List<WebElement> infoLinks;

	public WebElement navbarContent;
	
	public void getTextOfLinks() {
		Iterator<WebElement> itr = infoLinks.iterator();
		while(itr.hasNext()) {
			String linkText = itr.next().getText();
			System.out.println(linkText);
			
		}
	}
	
	public void rightClickOnNavBar() {
		Actions actions =  new Actions(keywords.driver);
		actions.contextClick(navbarContent).build().perform();
	}
}
