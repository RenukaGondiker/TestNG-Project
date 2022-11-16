package Demo3;

import org.testng.annotations.Test;

public class DependsOnDemo {

	
@Test(dependsOnMethods="Method2")
public void method1() {
System.out.println("method1");

}

@Test()
public void method2() {
System.out.println("method2");	
	
	
}
}
