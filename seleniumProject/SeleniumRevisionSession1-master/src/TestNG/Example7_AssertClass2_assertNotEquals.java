package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_assertNotEquals 
{
	@Test
	public void TC2() 
	{
		String actResult="hi";
		String expResult="hi";
		
		Assert.assertNotEquals(actResult, expResult,"Failed: both results are same:  ");  
	}

}
