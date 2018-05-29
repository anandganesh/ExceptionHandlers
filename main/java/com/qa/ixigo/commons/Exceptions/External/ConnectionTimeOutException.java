package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.ConnectionClosedException;

@SuppressWarnings("serial")
public class ConnectionTimeOutException extends ExternalException{
	public ConnectionTimeOutException() {
		super();
	}
	public ConnectionTimeOutException(WebElement elem, String str) {
		super(elem,str);
		throw new ConnectionClosedException(str);
	}
}
