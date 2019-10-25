package resources;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initilizeDriver() throws IOException{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\IngeniousTechHubWorkSpace\\IngeniousTechHubApp\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
     String browserName=prop.getProperty("browser");
     if(browserName.equals("chrome")){
    	System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 
    	 
     }
     else if(browserName.equals("firfox")){
    	 
     }
     
     else if(browserName.equals("IE")){
    	 
     }
    driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     return driver;
     
	}
	
	public void getScreenShot(String result) throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\IngeniousTechHubWorkSpace\\IngeniousTechHubApp\\Screenshot"+result+"\\screenshot.png"));
		//"D:\IngeniousTechHubWorkSpace\IngeniousTechHubApp\Screenshot
		
	}
	

}
