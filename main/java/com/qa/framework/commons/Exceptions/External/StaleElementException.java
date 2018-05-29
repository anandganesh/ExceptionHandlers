package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class StaleElementException  extends ExternalException{

	public StaleElementException(){
		super();
	}
	public StaleElementException(WebElement elem, String str) {
		super(elem,str);
		throw new StaleElementReferenceException(str);
	}
}
