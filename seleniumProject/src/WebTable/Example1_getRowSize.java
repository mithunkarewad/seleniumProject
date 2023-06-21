package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/selenium%20soft/Html%20files/Sample5WebTable.html");
				
//		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//		int size = allRows.size();
//		System.out.println(size);
		
		int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowsize);
	}

}
