package Demo3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedDemo {

	@Test
	@Parameters({"username", "password"})
	public void login(String username1,String Password) {
		
		System.out.println(username1);
		System.out.println(Password);
	}
}

	
	
	
	
	
	
	
	
	