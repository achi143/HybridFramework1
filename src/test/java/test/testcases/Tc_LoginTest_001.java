package test.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.BaseTest;
import test.PageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseTest {


	
	@Test
	
	public void loginTest() {
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		
		
		logger.info("browser is open");
		
		loginpage.setUserName(Username);
		
		logger.info("entered username ");
		
		loginpage.setPassword(password);
		
		logger.info("entered password");
		
		loginpage.submit();
	}

}
