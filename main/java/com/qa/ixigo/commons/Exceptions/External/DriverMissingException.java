package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.events.WebDriverEventListener;

@SuppressWarnings("serial")
public class DriverMissingException extends ExternalException {

	public DriverMissingException(){
		super();
	}
	public DriverMissingException(WebDriver driver,String msg){
		super(driver,msg);
		throw new UnreachableBrowserException(msg);
	}

}
