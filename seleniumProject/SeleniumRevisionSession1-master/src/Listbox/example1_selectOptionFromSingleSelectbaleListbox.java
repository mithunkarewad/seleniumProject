package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionFromSingleSelectbaleListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
		Thread.sleep(3000);
		
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2: 
		Select s=new Select(month);
		
		//step3:
		//s.selectByVisibleText("Dec");      //String visibleText
		s.selectByValue("12");             //String value
		s.selectByIndex(6);                 //int index		
	}
}
