package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import rediffloginpage.redifloginpage1;



public class logintestcase {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		redifloginpage1 rd1=new redifloginpage1(driver);
		rd1.Email().sendKeys("test122");
		rd1.EnterPassword().sendKeys("gdghh");
		rd1.PerformLogin().click();
	}

}
