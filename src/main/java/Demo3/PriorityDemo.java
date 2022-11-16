package Demo3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityDemo {

	@BeforeClass
	public void method6() {
	System.out.println("test3method6 beforeClass");
		
	}
   @Test(priority=1)
   public void method1() {
	System.out.println("test2method1");
   }
   
   @Test(priority=2)
   public void method3() {
  System.out.println("test3method3");
  
   }
   
   @Test
   public void method2() {
System.out.println("test3method2");   

   }
   
   @Test(priority=1)
   public void bmethod4() {
System.out.println("test2method4");

   }




	   
   
   
   
   
   
   }














