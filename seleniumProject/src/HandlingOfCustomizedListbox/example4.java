package HandlingOfCustomizedListbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4
{
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/pc/beverages/tea/?nc=ct-fa&sid=Ju8bY4-pYmF0Y2hfaWR4AKFjAaJuZsOiY2OjMzUxqHNrdV9saXN0kKJhb8KidXLComFww6JsdM0BLaNkc2rNJrShb6pwb3B1bGFyaXR5o3RhYqNhbGylc3JfaWQBomRzzQa4o21yaQE%3D#!page=1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='col-xs-12 checkbox ng-scope']"));
		
		int count =0;
		for(WebElement s1:allOptions)
		{
			s1.click();
			Thread.sleep(5000);
			if(count==5)
			{
				break;
			}			
		}
		
		
	}

}
