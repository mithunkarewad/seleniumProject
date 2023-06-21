package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Maximize
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
				
		Thread.sleep(2000);
				
		driver.manage().window().maximize();
		
//		Options s1 = driver.manage();
//		Window s2 = s1.window();
//		s2.maximize();
	}

}
