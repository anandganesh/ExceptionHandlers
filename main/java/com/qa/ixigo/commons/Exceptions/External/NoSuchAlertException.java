package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

@SuppressWarnings("serial")
public class NoSuchAlertException extends ExternalException {
	public NoSuchAlertException() {
		super();
	}
	public NoSuchAlertException(WebElement elem, String str) {
		super(elem,str);
		throw new NotFoundException();
	}

}
