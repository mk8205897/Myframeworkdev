package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By emailAddress=By.id("user_email");
	By password=By.id("user_password");
	By loginButton=By.xpath("//input[@value='Log In']");
	By contactlink=By.xpath("//a[contains(text(),'Contact')]");
	
	
	
	public  LoginPage(WebDriver drvier){
		this.driver=drvier;
	}
	
	public WebElement getemailAddress(){
		return driver.findElement(emailAddress);
	}
	
	public WebElement getpassword(){
		return driver.findElement(password);
	}
	
	public WebElement getloginButton(){
		return driver.findElement(loginButton);
		
	}
	
	public WebElement getcontactlink(){
		return driver.findElement(contactlink);
	}

}
