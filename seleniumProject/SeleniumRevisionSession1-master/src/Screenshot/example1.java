package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		
		File dest=new File("C:\\Users\\sanja\\OneDrive\\Desktop\\Daily Examples\\RevisionSession\\Selenium\\demo\\abc1.jpg");
		
		
		FileHandler.copy(src, dest);
	}

}
