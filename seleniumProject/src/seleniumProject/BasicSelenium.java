package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");

	}

}
