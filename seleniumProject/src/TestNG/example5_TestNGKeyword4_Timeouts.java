package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword4_Timeouts
{
	
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(8000);
		Reporter.log("--running TC1--",true);
	}

}
