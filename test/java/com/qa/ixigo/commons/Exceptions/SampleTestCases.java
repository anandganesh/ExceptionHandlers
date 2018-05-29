package com.qa.ixigo.commons.Exceptions;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.qa.ixigo.commons.Exceptions.External.OperationTimeOutException;
import com.qa.ixigo.commons.Exceptions.External.StaleElementException;
import com.qa.ixigo.commons.Exceptions.External.WebElementNotFound;

public class SampleTestCases {
private static  WebElement elem = null;
	
	@Test
	public void testCommons() {
		throw new WebElementNotFound("Element Not found");
	}
	
	@Test
	public void testWebElement() {
		throw new WebElementNotFound(elem,"Element Not Found");
		
	}
	
	@Test
	public void testTimeOut() {
		throw new OperationTimeOutException(elem,"Operation has been Timeed out");	
	}
	
	@Test
	public void testStaleElements() {
		throw new StaleElementException(elem,"Element Removed from DOM");
	}
	@Test
	public void testWebElementWithExceptionMessage() {
		
		throw new WebElementNotFound(elem,"Omg i am gone",Exception.class);
	}
}
