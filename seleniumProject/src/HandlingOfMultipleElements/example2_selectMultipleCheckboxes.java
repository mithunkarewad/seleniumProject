package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_selectMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/selenium%20soft/Html%20files/Multiplechechboxes1.html");
		
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(allCheckboxes.size());
		
//		for(WebElement s1: allCheckboxes)
//		{
//			s1.click();
//			Thread.sleep(500);
//		}	
		
		for(int i=0; i<=allCheckboxes.size()-1; i++)
		{
			allCheckboxes.get(i).click();
			Thread.sleep(500);
		}
	}
}
