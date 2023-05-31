package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		//object of webdriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		//navigate to method
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		//back
		driver.navigate().back();
		Thread.sleep(1000);
		//forword
		driver.navigate().forward();
		Thread.sleep(1000);
		//driver.quit();
		driver.close();
		
		
		
		

	}

}
