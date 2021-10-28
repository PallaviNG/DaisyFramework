package com.testingshastra.utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingshastra.keywords.UIKeywords;

/**
 * 
 * @author SHREE
 *
 */

public class WaitFor {
	private static final Logger LOG = Logger.getLogger("WaitFor.class");
	private static final WebDriverWait wait;
//	UIKeywords keywords = UIKeywords.getInstance();
	static {
		UIKeywords.getInstance();
		wait = new WebDriverWait(UIKeywords.driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
	}
	
	/**
	 * This method waits for the visibilty of the element.
	 * If the element not visible within given duation,
	 * throws <b><q>NoSuchElementException.</q></b>
	 * @param element
	 * @param duration
	 */
	public static void visibilityOfElement(WebElement element, int duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
		LOG.info("Waiting for element to be visible");
	}
	
	/**
	 * The <b>stale element refernece</b> error is a WebDriver that occurs
	 * because the referenced web element is no longer attached to the DOM.
	 * @param element
	 * @param duration
	 */
	public static void stalenessOfElement(WebElement element, int duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.stalenessOf(element));
	}
	
	/**
	 * This method wait for the element to be clickable condition.
	 * Otherwise throws <b><q>NoSuchElementException.</q></b>
	 * @param element
	 * @param duration
	 */
	public static void elementToBeClickableElement(WebElement element, int duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		LOG.info("waiting for an element to be clickable");
	}
}