package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	
	WebDriver driver;
	// this driver dont have scope
	
	//driver.findElements(By.xpath("//hshsju")).sendKeys("test");
     By username= By.xpath("//input[@id='username']");
	 By password =By.xpath("//input[@id='password']");
     By login=By.xpath("//input[@id'Login']");
    
    By tryForFree=By.xpath("//a[@id='signup_link']");
    By actualerrormsg=By.xpath("//div@id='error']");
	
    //public Object errorMsg;
    
 
	

	

	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void LoginPagrObjects(WebDriver driver2) {
		  this.driver=driver2;
		  
	}
	
    public WebElement enterUsername() {
    	return driver.findElement(username);
    	
    }
	public WebElement enterPassword() {
		return driver.findElement(password);
		
	}
	
	public WebElement clickonLogin() {
		return driver.findElement(login);
		
	}
	public WebElement clickOntryForFree() {
		return driver.findElement(tryForFree);
		
	}
	public WebElement errormsg() {
		return driver.findElement(actualerrormsg);
	}
	
}

