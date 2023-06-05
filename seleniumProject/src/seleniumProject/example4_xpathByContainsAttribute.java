package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_xpathByContainsAttribute
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//enter UN
   WebElement un = driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]"));
un.sendKeys("xys");
Thread.sleep(2000);
un.clear();
		
		//enter pwd
		//driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
	
	
	
	}

}