package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		//step1:
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//step2:  
		Actions act=new Actions(driver);
				
		//step3:
		act.moveToElement(login).perform();
		
		Thread.sleep(2000);
		
		//click on wishlist element
		driver.findElement(By.xpath("//div[text()='Wishlist']")).click();			
	}
}
