package Resource;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public WebDriver driver;
	Properties prop;
	public WebDriver intializeDriver() throws IOException{

	//To read the data 
 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.properties");

 
	//To access the data.properties file
 prop=new Properties();
 
 //loading the readed file 
prop.load(fis);	

prop.getProperty("browser");

String browserName=prop.getProperty("browser");

if(browserName.equalsIgnoreCase("chrome"))
	
{
	//webDriverManager.chromedriver().browserVersion("79.0.9").setup://to run specific version		
	WebDriverManager.chromedriver().setup();// to run with the latest browser
	driver=new ChromeDriver();
	}

else if(browserName.equalsIgnoreCase("firefox")) {
	//firefox code
}

else if(browserName.equalsIgnoreCase("edge")) {
//edge code
}

else {
	System.out.println("please enter proper browser value");
}
return driver;


	}

@BeforeMethod
public void urlLAunch() throws IOException {
	
	driver=intializeDriver(); //This driver have scope
	driver.get(prop.getProperty("url"));
	
	
}
}
	
	
	
	
	
	
	
	
