package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

@SuppressWarnings("serial")
public class OperationTimeOutException extends ExternalException{

	public OperationTimeOutException() {
		super();
	}
	public OperationTimeOutException(WebElement elem, String str) {
		super(elem,str);
		throw new TimeoutException();
	}
}
