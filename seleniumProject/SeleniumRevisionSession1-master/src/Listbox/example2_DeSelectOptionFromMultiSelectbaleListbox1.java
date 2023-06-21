package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_DeSelectOptionFromMultiSelectbaleListbox1 
{
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/selenium%20soft/Html%20files/Sample4Listbox.html");		
			
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
//		s.deselectByIndex(1);
//		s.deselectByIndex(0);
		
		s.deselectByVisibleText("Sri");
		s.deselectByVisibleText("Ind");
		
//		//s.deselectByValue("");	
	}
}
