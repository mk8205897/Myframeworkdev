package IngeniousTechHub.IngeniousTechHubApp;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	LandingPage l;
	LoginPage loginPage;
	
@BeforeTest
	
	//@BeforeMethod
	public void initilize() throws IOException{
		driver=initilizeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigate(String UseName,String Password,String text) throws IOException{
		
		driver.get(prop.getProperty("url"));
		l=new LandingPage(driver);
		l.getlogIn().click();
		loginPage=new LoginPage(driver);
		//loginPage.getemailAddress().sendKeys("mohit@123");
		loginPage.getemailAddress().clear();
		loginPage.getemailAddress().sendKeys(UseName);
		//loginPage.getpassword().sendKeys("mohit123");
		loginPage.getpassword().clear();
		loginPage.getpassword().sendKeys(Password);
		
		loginPage.getloginButton().click();
		log.info(text);
		//String actual="Featured Courses";
	//String expexted=l.getfeatureCourses().getText();
		//Assert.assertEquals(actual, expexted);
		}
		
	

	@DataProvider()
	public Object[][] getData(){
		Object[][] obj=new Object[2][3];
		
		obj[0][0]="mohit@123";
		obj[0][1]="mohit123";
		obj[0][2]="mohitdata";
		
		obj[1][0]="mohit@123";
		obj[1][1]="mohit123";
		obj[1][2]="mohitdata";
		
		
		
		return obj;
	}
	
@AfterTest
	//@AfterMethod
	
	public void tearDown(){
		driver.close();
		driver=null;
	}
}


