package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_HiddenDivisionPopup
{
	public static void main(String[] args)
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
		
	}

}
