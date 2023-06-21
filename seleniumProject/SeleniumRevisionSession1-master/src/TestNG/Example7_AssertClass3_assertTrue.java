package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass3_assertTrue 
{
	@Test
	public void TC3() 
	{
		boolean actResult = false;
		
		Assert.assertTrue(actResult, "Failed: act result is false- ");  
	}

}
