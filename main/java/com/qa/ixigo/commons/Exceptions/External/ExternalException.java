package com.qa.ixigo.commons.Exceptions.External;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ErrorCodes;

public abstract class ExternalException extends WebDriverException{

	
	/**
	 * Implementing Abstract Class for WebDriverException.
	 * The below exceptions are inherited from Selenium WebDriverException - For giving more info in the logger we are having these over here
	 * 1.ExternalException(ErrorCodes code)
	 * 2.ExternalException(String message, Throwable cause, ErrorCodes code)
	 * 3.ExternalException(String message, ErrorCodes code)
	 * 4.ExternalException(Throwable cause, ErrorCodes code)
	 * 
	 * The below implementations are custom ones to make our life easier :)
	 * 1.ExternalException(String str)
	 * 2.ExternalException(WebElement elem, String message) -->
	 * @param - WebElement,Logger Message 
	 * @author anandganesh
	 */
	public static Logger logger = Logger.getLogger(ExternalException.class.getName());
	
	private static final long serialVersionUID = 7718828512143293558L;
	
	private ErrorCodes code;
	
	public ExternalException() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ExternalException(ErrorCodes code) {
		super();
		this.code = code;
	}

	public ExternalException(String message, Throwable cause, ErrorCodes code) {
		super(message, cause);
		logger.info("Message ---------> :"+message+"\t Cause ---------> :"+cause+"\t Code ---------> :"+code);
		this.code = code;
	}

	public ExternalException(String message, ErrorCodes code) {
		super("messsage");
		logger.info("Message ---------> :"+message+"\t Code ---------> :"+code);
		
		this.code = code;
	}

	public ExternalException(Throwable cause, ErrorCodes code) {
		super(cause);
		logger.info("Cause ---------> :"+cause+"\t Code ---------> :"+code);
		this.code = code;
	}
	
	public ExternalException(String str)
	{
		logger.info("Message --------->" +str);
	}
	
	public ExternalException(WebElement elem, String message)
	{
		logger.info("Web Element ---------> "+elem+"\t Message------------>"+message);
	}
	public ExternalException(Exception e, WebElement elem, String str) {

	
	}
	

	public ExternalException(WebElement elem, String message, Exception e) {
		// TODO Auto-generated constructor stub
		logger.info("Web Element -------->" +elem+"\t Message ----------->"+message+"\t Exception Trace ----------->"+e.toString());
	}

	public ExternalException(WebElement elem, String string, Class<Exception> class1) {
		// TODO Auto-generated constructor stub
		logger.info("Web Element -------->" +elem+"\t Message ----------->"+string+"\t Exception Trace ----------->"+class1.getName());
	}

	public ExternalException(WebDriver driver, String msg) {
		// TODO Auto-generated constructor stub
		logger.info("Driver not found --------> Driver ="+driver+"Message -------->"+msg);
	}

	public ErrorCodes getCode() {
		return this.code;
	}
}
