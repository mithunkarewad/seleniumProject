package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_DisableTCExecution1_From_TestClass
{
	
	@Test
	public void TC1()
	{
		Reporter.log("--running TC1--",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	
	
	@Test(enabled = false)
	public void TC3()
	{
		Reporter.log("--running TC3--",true);
	}

}
