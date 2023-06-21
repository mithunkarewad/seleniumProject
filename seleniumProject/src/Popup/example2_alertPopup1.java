package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertPopup1
{
	public static void main(String[] args)
	{		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	
		//1: getText from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
//		//2: click on cancel btn from alert popup
//		driver.switchTo().alert().dismiss();
				
		//3: click on "OK" btn from 1st alert popup
		driver.switchTo().alert().accept();
		
		//3: click on "OK" btn from 2nd alert popup
		driver.switchTo().alert().accept();		
	}
}
