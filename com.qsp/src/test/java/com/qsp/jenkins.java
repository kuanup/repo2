package com.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkins {
	@Test
	public void jenkinsParameter() {
	String Browser = System.getProperty("BROWSER");
		Reporter.log("Browser");
		
		
	}

}
