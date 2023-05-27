package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProductCategiroyTest {
  @Test
  public void f() {
	  WebDriver driver=BrowserFactory.startBrowser("Chrome", "https://ebay.com");
	  
	 ClsEbay obj=new ClsEbay(driver);
	 obj.fncatSearch("Cameras & Photo", "Sony");
	  
	  
	  
	  Reporter.log("SearchTest is successfull....",true);
	  
  }
}
