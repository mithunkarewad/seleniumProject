package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass5
{	
	
	@Test
	public void TC5() 
	{
		String actResult="hello";
		String expResult="hi";
		Assert.assertEquals(actResult, expResult,"Failed1: both results are diff- ");    
		
		
		boolean actResult1 = false;		
		Assert.assertTrue(actResult1,"Failed2: act result is false- ");
	}
	
	
	

}
