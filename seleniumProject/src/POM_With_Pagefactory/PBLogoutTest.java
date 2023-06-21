package POM_With_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLogoutTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignIN();
		
		PBMobNumPage mobNum=new PBMobNumPage(driver);
		mobNum.inpPBMobNumPageMobNum();
		mobNum.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inpPBPwdPagePWD();
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
		
		PBHomePage home=new PBHomePage(driver);
		home.openDDOptionPBHomePageMyAcc();
		Thread.sleep(4000);
				
		PBMyAccPage myAcc=new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageSignOut();
				
		Thread.sleep(2000);
		
		driver.quit();
	}
}
