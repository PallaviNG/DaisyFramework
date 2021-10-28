package com.testingshastra.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testingshastra.keywords.UIKeywords;

public class BaseClass {
		UIKeywords keyword = new UIKeywords();
		public RemoteWebDriver driver = null;
		
		@BeforeMethod
		public void setup() {
			keyword.openBrowser("Chrome");
			this.driver=keyword.getDriver();
		}
		
		@AfterMethod
		public void tearDown() {
			keyword.quitBrowser();
		}
}
