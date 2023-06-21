package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathByAttribute1 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter UN
		//driver.findElement("locator")
		//driver.findElement(By.xpath("xpathxpression"))
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
			
		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
