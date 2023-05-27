package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProductSearchTest {
  @Test
  public void search() {
	  WebDriver driver=BrowserFactory.startBrowser("Chrome", "https://ebay.com");
	  
	  
	 ClsEbay obj=new ClsEbay(driver);
	 obj.fnSearch("Sony");
	 
	 
	  Reporter.log("SearchTest is successfull....",true);
  }
}
