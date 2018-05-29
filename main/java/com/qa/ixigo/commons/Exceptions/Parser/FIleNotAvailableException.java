package com.qa.ixigo.commons.Exceptions.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

@SuppressWarnings("serial")
public class FIleNotAvailableException extends Exception {
	public static Logger logger = Logger.getLogger(FIleNotAvailableException.class.getName());
	
	public FIleNotAvailableException() {
		super();
	}
	
	public FIleNotAvailableException(File f,String message) throws FileNotFoundException {
		logger.info("<-------------------------File is Not Available in the file Location----------------------------->");
		logger.info("File Path ---> " +f.getAbsolutePath()+"File Name-------> "+f.getName()+"Messaage ------------> "+message);
		throw new FileNotFoundException();
	}

}
