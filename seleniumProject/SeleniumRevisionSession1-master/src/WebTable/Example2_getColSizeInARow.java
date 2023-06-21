package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInARow 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/selenium%20soft/Html%20files/Sample5WebTable.html");
				

		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colSize);
				
		//for header
		int colSize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(colSize1);
	}
}
