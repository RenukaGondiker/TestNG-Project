package Demo3;

import org.testng.annotations.Test;

public class DifferentAnnotations {
	
	
	@Test(enabled=false)
	public void method2() {
	System.out.println("method2");
	
	}



@Test(timeOut=5000)
public void method3() {
System.out.println("method2");
}


//this will run same test multiple times with same data

@Test(invocationCount=10)
public void test2() {
System.out.println("hello");}
}