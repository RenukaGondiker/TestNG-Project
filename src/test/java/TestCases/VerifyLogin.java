package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectModel.LoginPageObjects;
import Resource.BaseClass;
import Resource.Constant;

public class VerifyLogin extends BaseClass{
@Test
public void login() throws InterruptedException	{
	//driver.findElements(By.xpath("//path")).sendKeys("test");
   
   LoginPageObjects LPO =new LoginPageObjects(driver);

   LPO.enterUsername().sendKeys(Constant.username);
   
   LPO.enterPassword().sendKeys(Constant.password);
   
   LPO.clickonLogin().click();
   
SoftAssert sa=new SoftAssert();
   
 String expectedString=Constant.expectedString;
 String actualString=LPO.errormsg().getText();
 sa.assertEquals(actualString, expectedString);
 
 sa.assertAll();
  
   String errorEsse2="ghjnbhjjd";
   String actualErrorMsg2="jdjjdh";
 sa.assertEquals(errorEsse2,actualErrorMsg2);
}  
  
}
  
   


   
   
   
   
   
   
   
   
   
  

//System.out.println(Constant.expectedString);
//System.out.prinntln(LPO.errorMsg().getText());
//System.exit(0);

//Thread.sleep(5000);
// CommonUtilities.handleAssertions(LPO.errorMsg).getText().(Constant.expected);



//String expectedString="Please check your password.If you still cant login,contact your Salesforce administrator";
//String actualString=driver.findElement(By.xpath("//div[@Id='error']")).getText();

    
    
    
    
   //LPO.userNameEnter().sendKeys(Constant.username);
	
	//CommonUtilities.handleExplicitWaitElement(1,LPO.passwordEnter());Explicit is usingWebElement)
   // LPO.passwordEnter().sendKeys(Constant.password);
    
    
  //CommonUtilities.handleExplicitWaitElement(1,LPO.passwordEnter());Explicit is using By,make by elment as public)
    // LPO.loginClick().click();
    
    //Assertion method
   //  CommonUtilities.handleAssertions(Constant.expected,LPO.actualText().getText);}
     
   
     



