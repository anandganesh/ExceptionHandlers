package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

@SuppressWarnings("serial")
public class WebElementNotFound extends ExternalException {

	public WebElementNotFound() {
		super();
	}

	public WebElementNotFound(String str) {
		super(str);
	}

	public WebElementNotFound(WebElement elem, String message) {
		super(elem, message);
		throw new NotFoundException();
	}
	public WebElementNotFound(WebElement elem, String message, Exception e) {
		super(elem,message,e);
		throw new NotFoundException();
	}

	public WebElementNotFound(WebElement elem, String string, Class<Exception> class1) {
		// TODO Auto-generated constructor stub
		super(elem,string,class1);
		throw new NotFoundException();
	}

	
}
