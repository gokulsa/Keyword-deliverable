package com.qa.hubspot.tests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.hubspot.keyword.engine.KeyWordEngine;

public class LoginTest {
	public KeyWordEngine keyWordEngine;
	
	@Test
	@Parameters("sheetname")
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
	
	
	

}