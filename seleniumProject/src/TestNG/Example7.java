package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		boolean result = driver.findElement(By.xpath("")).isEnabled();		
				
		if(result)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
		
		
	}
}
