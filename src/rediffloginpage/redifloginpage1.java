package rediffloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class redifloginpage1 {
	
		
	    WebDriver driver;
	    public redifloginpage1(WebDriver driver) {
	    	this.driver=driver;
	    }
		By username=By.xpath("//*[@id=\"login1\"]");
		By password=By.xpath("//*[@id=\"password\"]");
		By loginbtn=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
		public WebElement Email()
		{
			return driver.findElement(username);
		}
		public WebElement EnterPassword()
		{
			return driver.findElement(password);
		}
		public WebElement PerformLogin()
		{
			return driver.findElement(loginbtn);
		}

}
