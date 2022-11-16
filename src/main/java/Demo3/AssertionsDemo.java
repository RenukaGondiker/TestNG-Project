package Demo3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	
//Soft N Hard Asserts
	
//Hard Assert--If assertion fails it will not execute the further script
	
@Test 	
public void method1(){
	
	Assert.assertEquals(19, 19,"value is not matching");
	System.out.println("hello");
	
	
}
@Test
public void method2() {
	
	SoftAssert assertion=newSoftAssert();
	
	assertion.assertEquals(12,12);
	System.out.println("hello after test");
	
	assertion.assertAll();//this is mandorty line 
}
private SoftAssert newSoftAssert() {
	// TODO Auto-generated method stub
	return null;
}
	
	
	
	
}
