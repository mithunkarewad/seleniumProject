package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathByAttribute1 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyd");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("bcd");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//enter UN
		//driver.findElement("locator")
		//driver.findElement(By.xpath("xpathxpression"))
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		//enter pwd
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
			
		//click on login btn
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}