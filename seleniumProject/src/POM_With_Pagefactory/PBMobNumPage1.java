package POM_With_Pagefactory;
//pom class 2

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PBMobNumPage1
{
	 private WebElement mobNum;
	 private WebElement signInWithPwd;
	
	
	public PBMobNumPage1(WebDriver driver)
	{
		mobNum=driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]"));
		signInWithPwd=driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]"));		
	}
	
	public void enterMobNum()
	{
		mobNum.sendKeys("7020500587");
	}
	
	public void clickOnSignInWithPwdBtn() 
	{
		signInWithPwd.click();
	}
}
