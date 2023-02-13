package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Locators_by_id 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  
	  WebElement userid = driver.findElement(By.id("email"));
	  userid.sendKeys("dnyaneshwer");
	  WebElement  password = driver.findElement(By.id("pass"));
	  password.sendKeys("126337474");
	  WebElement  LoginBTN = driver.findElement(By.id("button"));
	  userid.clear();
	  password.clear();
	  LoginBTN.click();
	

}
}