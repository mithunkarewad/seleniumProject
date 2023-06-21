package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_getSizeOfAlltSelectedOptionFrom_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/selenium%20soft/Html%20files/Sample4Listbox.html");		
			
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectCountry);
		
		s.selectByIndex(3);
		s.selectByIndex(2);
		s.selectByIndex(0);
		
		
//		int size = s.getAllSelectedOptions().size();
//		System.out.println(size);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size = allSelectedOptions.size();
		System.out.println(size);
				
	}
}
