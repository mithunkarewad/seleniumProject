package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionFromMultiSelectbaleListbox 
{
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		//step2: 
		Select s=new Select(selectCountry);
		
		//step3:
//		s.selectByVisibleText("Aus");
//		s.selectByVisibleText("Sri");
//		s.selectByVisibleText("Ind");
		//s.selectByValue("");
		s.selectByIndex(0);
		s.selectByIndex(2);
	}
}