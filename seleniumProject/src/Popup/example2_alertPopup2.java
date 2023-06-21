package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertPopup2
{
	public static void main(String[] args)
	{		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
			
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		
		//1: getText from alert popup
		String text = alt.getText();
		System.out.println(text);
		
//		//2: click on cancel btn from alert popup
//		alt.dismiss();
				
		//3: click on "OK" btn from 1st alert popup
		alt.accept();
		
		//3: click on "OK" btn from 2nd alert popup
		alt.accept();	
		
		
	}
}
