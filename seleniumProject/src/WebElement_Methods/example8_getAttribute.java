package WebElement_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example8_getAttribute
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
						
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println(text);		
	}
}
