package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObject;
import Resource.BaseClass;
import Resource.CommonUtilities;
import Resource.Constant;

public class VerifySignUp extends BaseClass {

@Test
public void signup() throws IOException, InterruptedException {
	
	
	//intializeDriver();
	//driver.get("https://login.salesforce.com/?locale=in");
	
	LoginPageObjects LPO=new LoginPageObjects(driver);
	((WebElement) LPO.clickOntryForFree()).click();
   
     
     SignUpPageObject SPO=new SignUpPageObject(driver);
     
     Thread.sleep(5000);
     //CommonUtilities.handleExplicitWaithroughBy(10,SPO.firstname);
     
     SPO.enterFirstname().sendKeys(Constant.firstName);
     SPO.enterLastname().sendKeys(Constant.lastName);
     SPO.enterJobTitle().sendKeys(Constant.JobTitle);
     SPO.enterEmail().sendKeys(Constant.Email);
     SPO.enterPhone().sendKeys(Constant.phone);
     
     SPO.enterCompany().clear();
     SPO.enterCompany().sendKeys(Constant.Company);
     Thread.sleep(5000);
     
     //Employee DropDown
    CommonUtilities.handleStaticDropdown(SPO.selectEmployees(), 1);
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"])[1]")).click();
    
    CommonUtilities.handleStaticDropdown(SPO.selectCountry(), 1);
    
    CommonUtilities.handleStaticDropdown(SPO.selectState(), 5);
}

     
     
     
     
     


     
     
     
    
     
     
     
     //WebElement
    // e=SPO.selectEmployee();
     
   //  Select s=new Select(e);
    // s.selectByIndex(1);






}
	
	
	
	
	
	

