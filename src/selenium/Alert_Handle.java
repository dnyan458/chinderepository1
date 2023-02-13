package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Handle 
{

	public static void main(String[] args) 
	{
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\chromedriver.exe");
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\msedgedriver.exe");
	     // WebDriver driver = new EdgeDriver();
		 // WebDriver driver = new ChromeDriver();
			
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Ash\\eclipse-workspace\\Selenium2022\\binary\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
			/*
			 * driver.get("https://www.flipkart.com");
			 * driver.navigate().to("https://facebook.com");
			 */
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  
		  WebElement customerid = driver.findElement(By.name("cusid"));
		  customerid.sendKeys("12334555");
		  WebElement SubmitBTN = driver.findElement(By.name("submit"));
		  SubmitBTN.click();
		 // WebElement resetBTN = driver.findElement(By.name("reset"));
		  //resetBTN.click();
		  
		  String AlertText = driver.switchTo().alert().getText();
		  System.out.println(AlertText);
		  
		  
		    //driver.switchTo().alert().accept();
		  //driver.switchTo().alert().dismiss();
		 // driver.switchTo().alert().getText();
		 // driver.switchTo().alert().sendKeys("dnyaneshwer");
		  
		  
		  
         
	}

}
