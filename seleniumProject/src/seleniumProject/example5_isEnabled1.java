package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isDisplayed();
		System.out.println(result);
		
		if (result)
		{
			System.out.println("Element is enabled");
		}
		else 
		{
			System.out.println("Element is disabled");
		}
	}
}