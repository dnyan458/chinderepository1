package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_by_tagname 
{
	public static void main(String[] args) 
	{  
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		  
		  WebElement userid = driver.findElement(By.className("inputtext"));
		  userid.sendKeys("dnyaneshwer");
		  WebElement  password = driver.findElement(By.name("pass"));
		  password.sendKeys("126337474");
		  WebElement  LoginBTN = driver.findElement(By.tagName("button"));
		  userid.clear();
		  password.clear();
		  LoginBTN.click();
		  
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println(links.size());
		  
		  List<WebElement> divs = driver.findElements(By.tagName("div"));
		  System.out.println(divs.size());
		  
		  List<WebElement> image = driver.findElements(By.tagName("img"));
		  System.out.println(image.size());
		
		

	}

}
