package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_WithDDF1 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\28Th Jan Eve\\28thJan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//click on sign in btn from login page
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//enter mob num
		String mobNum = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mobNum);
		
		//click on signIn with pwd btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(2000);
		
		//enter pwd
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		//click on signIn btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		//open my account dropdown options
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		Thread.sleep(2000);
		
		//click on my profile btn
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Thread.sleep(2000);
		
		
		//switch to child window
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		
		
		//get full name
		String actText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		
		if(actText.equals(expText))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
		
		Thread.sleep(2000);
		
		driver.quit();	
	}
}
