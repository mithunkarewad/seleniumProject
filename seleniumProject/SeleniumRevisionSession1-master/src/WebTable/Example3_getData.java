package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getData
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/selenium%20soft/Html%20files/Sample5WebTable.html");
				

		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
		System.out.println(text);
				
		//for header
		String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		System.out.println(text1);
	}
}
