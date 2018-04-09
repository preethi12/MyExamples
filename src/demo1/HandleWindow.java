package demo1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleWindow {
	
	public static void main(String[] args) {
		WebDriver driver;

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//add wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter URL
		driver.get("https://www.freecrm.com/index.html");
		
		//enter username, password and login
		
		driver.findElement(By.name("username")).sendKeys("preethi");
		driver.findElement(By.name("password")).sendKeys("pintu@1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
		
	}

}
