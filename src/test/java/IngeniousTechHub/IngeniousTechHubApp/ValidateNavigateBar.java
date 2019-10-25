package IngeniousTechHub.IngeniousTechHubApp;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.LoginPage;
import resources.base;

public class ValidateNavigateBar extends base {
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initilize() throws IOException{
		driver=initilizeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test()
	public void validatetitleTest() throws IOException{
		
		LoginPage lp=new LoginPage(driver);
		//boolean isdispay=lp.getcontactlink().isDisplayed();
		Assert.assertTrue(lp.getcontactlink().isDisplayed());
		log.info("Navigation bar is displayed");

}
	
	@AfterTest
	public void teanDown(){
		driver.close();
		driver=null;
	}
	
	
	
}