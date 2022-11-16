package Demo1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void method1() {
		
	System.out.println("test1method1");
	}
	@BeforeSuite
	public void method2() {

	System.out.println("test1method2");
	}
	
	@AfterSuite
	public void method3() {
		
	System.out.println("test1method3");
	
	}
	
	@Test
	public void method4() {
		
	System.out.println("test1method4");
	
	}
	
	@AfterSuite
	public void method5() {
		
		System.out.println("test1method5");
		
	
	
	
}
}