package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_getText
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(text);
		
		//System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());

	}
}
