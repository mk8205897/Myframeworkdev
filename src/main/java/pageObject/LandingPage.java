package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	
	By logIn=By.xpath("//a[contains(@href,'http://qaclickacademy.usefedora.com/sign_in')]/i/following::span[1]");
	By featureCourses=By.xpath("//section[@id='content']/div/div/h2");
	/*
	 * Featured Courses
	 */
	
	public LandingPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public WebElement getlogIn(){
		return driver.findElement(logIn);
	}
   public WebElement getfeatureCourses(){
	   
	   return driver.findElement(featureCourses);
   }

}
