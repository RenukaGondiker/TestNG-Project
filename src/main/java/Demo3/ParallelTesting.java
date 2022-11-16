package Demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	public WebDriver driver;
    @Test
	public void FirefoxTest() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	driver = new ChromeDriver(); //session id 1 generated

	Thread.sleep(5000);

	driver.get("https://login.salesforce.com/?locale=in");

	System.out.println("The threD ID for Firefox is "+ Thread.currentThread().getId());

	}

	@Test

	public void ChromeTest()throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver =new ChromeDriver(); // session id 2 generated
		
		Thread.sleep(5000);
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		System.out.println("The thread ID for Firefox is "+Thread.currentThread().getId());
		
	}
		
		
		
		
		

		
		
		
		
	}
		
