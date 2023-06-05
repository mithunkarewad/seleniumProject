package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//open browser
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//check title
	String title=driver.getTitle();
	System.out.println(title);
	//check url
	String url =driver.getCurrentUrl();
	System.out.println(url);
	//check pagesource code
	//String html=driver.getPageSource();
	//System.out.println(html);

	}

}
