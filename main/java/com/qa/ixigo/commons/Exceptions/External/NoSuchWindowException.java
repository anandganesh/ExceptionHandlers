package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

@SuppressWarnings("serial")
public class NoSuchWindowException extends ExternalException{
	public NoSuchWindowException() {
		super();
	}
	public NoSuchWindowException(WebElement elem, String message) {
		super(elem,message);
		throw new NotFoundException();
	}
}
