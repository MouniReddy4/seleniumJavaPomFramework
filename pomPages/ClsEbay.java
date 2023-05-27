package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay {
	public WebDriver wd;
	
	public  ClsEbay(WebDriver  d)
	{
		wd=d;
	}
	
	By txtSearch=By.id("gh-ac");
	By btnSearch=By.id("gh-btn");
	
	By ddcat=By.id("gh-cat");
	
	public void fnSearch(String pName)
	{
		wd.findElement(txtSearch).sendKeys(pName);
		wd.findElement(btnSearch).click();
		
	}
	
	public void fncatSearch(String cat,String prodNmae)
	{
		WebElement ele=wd.findElement(ddcat);
		Select s=new Select(ele);
		s.selectByVisibleText(cat);
		
		fnSearch(prodNmae);
		
		
	}
	

}
