package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naviagtion 
{

	public static void main(String[] args) 
	{
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\chromedriver.exe");
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\msedgedriver.exe");
	     // WebDriver driver = new EdgeDriver();
		 // WebDriver driver = new ChromeDriver();
			
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.flipkart.com");	 
		  driver.navigate().to("https://facebook.com");
		  driver.navigate().back();
		  driver.navigate().refresh();
		  driver.navigate().forward();
		  driver.manage().window().maximize();
		  
		 // driver.close();
		 // driver.quit();


	}

}
