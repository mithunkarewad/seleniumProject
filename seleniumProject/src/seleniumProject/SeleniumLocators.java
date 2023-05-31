package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
WebElement search_box = driver.findElement(By.id("twotabsearchtextbox"));
search_box.sendKeys("oppo mobile");
search_box.sendKeys(Keys.ENTER);
Thread.sleep(1000);
//drive close();

	}

}
