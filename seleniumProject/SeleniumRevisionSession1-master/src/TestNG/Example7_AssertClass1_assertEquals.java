package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_assertEquals 
{
	@Test
	public void TC1() 
	{
		String actResult="hello";
		String expResult="hi";
		
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff- ");    //className.methodname();
	}

}
