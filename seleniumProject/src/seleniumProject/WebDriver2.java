package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/mithunkarewad/seleniumProject/blob/master/seleniumProject/src/seleniumProject/BasicSelenium.java");
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle());
        String title = driver.getTitle();
        System.out.println(title);
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        System.out.println(driver.getCurrentUrl());
	}

}
