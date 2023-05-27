package pomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductCategiroyTest {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ebay.com");
	  
	  WebElement ele=driver.findElement(By.id("gh-cat"));
	  Select s=new Select(ele);
	  s.selectByVisibleText("Cameras & Photo");
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("Sony");
	  driver.findElement(By.id("gh-btn")).click();
	  
	  Reporter.log("SearchTest is successfull....",true);
	  
	  
	  
	  
	  
	  
  }
}
