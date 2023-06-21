package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ImplicitWait 
{
	public static void main(String[] args)
	{		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		//enter FN
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		
	}

}
