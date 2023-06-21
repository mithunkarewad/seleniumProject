package WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example8_Navigate
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
			
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();		
	}
}
