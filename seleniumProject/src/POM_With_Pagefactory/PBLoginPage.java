package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage
{
	//step1: declaration
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIN;   //private WebElement signIN=driver.findElement(By.xpath(""));

	
	//step2: initialization
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);      //DiffclassName.methodname(webDriverObject, thisKeyword)
	}
	
	
	//step3: usage
	public void clickPBLoginPageSignIN() 
	{
		signIN.click();
	}
	
}
