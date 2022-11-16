package Demo3;

import org.testng.annotations.Test;

public class GroupsDemo {

	
	
@Test(groups="Regression")
public void method1() {
System.out.println("method1");
}


@Test(groups="Sanity")
public void method2() {
System.out.println("method2");
}


@Test(groups={"Sanity","Regression"})
public void method3() {
System.out.println("method3");
}






}








