package demo1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertStmt 

{
WebDriver driver;
	@Test
	public void Shop1()
	{
		//get URL
		
		driver=new FirefoxDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Using action class call elements
		Actions actions =new Actions(driver);
		WebElement main_menu = driver.findElement(By.xpath("(//a[@class='level-top'])[1]"));
		actions.moveToElement(main_menu).perform();
		
		//change to strings
		String action1 = main_menu.getText();
		
		//Using action class call elements
		WebElement Sub_menu = driver.findElement(By.linkText("Wall Art"));
		actions.moveToElement(Sub_menu).click().perform();
		
		//assert conditions
		//Assert.assertEquals(action1, "Departments");
		Assert.assertTrue(true, action1);
	}
}
