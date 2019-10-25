package IngeniousTechHub.IngeniousTechHubApp;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class ValidateTitle extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initlize() throws IOException{
		driver=initilizeDriver();
		log.info("Driver is initilize");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void validatetitleTest() throws IOException{
		
		 LandingPage l=new  LandingPage(driver);
		String actual="FEATURED COURSESss";
		String expected=l.getfeatureCourses().getText();
		Assert.assertEquals(actual,expected);
		LoginPage lp=new LoginPage(driver);
		//boolean isdispay=lp.getcontactlink().isDisplayed();
		Assert.assertTrue(lp.getcontactlink().isDisplayed());
		log.info("Successfully validated Text Message");
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
		
	}

}
