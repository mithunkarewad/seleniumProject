package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_xpathByIndex
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				
		
		Thread.sleep(2000);
		
		//enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
		
		
		//enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		
	}

}
