package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_ScrollIntoView2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		// click on close browser btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath("//h1[text()='Flipkart: The One-stop Shopping Destination']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele1);

		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Advertise']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele2);
		
		
		Thread.sleep(2000);

		 WebElement ele3 = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele3);

	}
}
