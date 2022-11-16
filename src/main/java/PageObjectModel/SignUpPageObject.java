package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

     public WebDriver driver;
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By JobTitle=By.xpath("//input[@name='UserTitle']");
	private By Email=By.xpath("//input[@name='UserEmail']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By Employees=By.xpath("select[@name='CompanyEmployee']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By State=By.xpath("select[@name='Company State']");
	        
	 public SignUpPageObject(WebDriver driver2) {
		 this.driver=driver2;
	 }
	        
	public WebElement enterFirstname() {
	return driver.findElement(firstname);
}

	public WebElement enterLastname() {
	return driver.findElement(lastname);
		
	}
    public WebElement selectEmployees() {
	return driver.findElement(Employees);
    }
	
	public WebElement enterJobTitle() {
		return driver.findElement(JobTitle);
	}
	public WebElement enterEmail() {
		return driver.findElement(Email);
    }
	public WebElement enterPhone() {
		return driver.findElement(phone);
	}
	public WebElement enterCompany() {
		return driver.findElement(Company);
	}
	public WebElement selectCountry() {
		return driver.findElement(Country);
	}	
	public WebElement selectState() {
		return driver.findElement(State);
		
	}
	



	
	
	
	
	
	
	
	
	
	
	
	
	
		
	public WebElement enterUserEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement enterUserPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement enterUserEmail1() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement selectCompanyCountry() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement checkAgree() {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement enterCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}
	}



