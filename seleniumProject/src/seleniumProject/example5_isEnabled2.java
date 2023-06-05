package seleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		//Thread.sleep(2000);
		
		 boolean result = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
		System.out.println(result);
		
		if (result)
		{
			System.out.println("Element is enabled");
		}
		else 
		{
			System.out.println("Element is disabled");
		}
	}
}