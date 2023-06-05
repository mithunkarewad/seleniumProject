package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("7720822056");
	driver.findElement(By.id("pass")).sendKeys("M852@772");
	//driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("[@id=\"u_0_2_LO\"]/div[5]")).click();
	

	

	
	
		



}}