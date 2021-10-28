package com.testingshastra.uitests.homepagetests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;

public class TS_TestCase extends BaseClass {
	String expectedTitle = "Testing Shastra | Training | Placement";
	UIKeywords keywords = UIKeywords.getInstance();

	public void verifyTitleOfHomePage() {
		keywords.launchURL("https://testingshastra.com");
		String title = keywords.getTitleOfPage();
		Assert.assertEquals(title, expectedTitle);
	}

}
