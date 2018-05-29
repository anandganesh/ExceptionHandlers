package com.qa.ixigo.commons.Exceptions.External;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

@SuppressWarnings("serial")
public class NoSuchFrameException extends ExternalException{
	
		public NoSuchFrameException() {
			super();
		}
		public NoSuchFrameException(WebElement elem, String str) {
			super(elem,str);
			throw new NotFoundException();
		}
}
