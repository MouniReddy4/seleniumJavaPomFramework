package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static WebDriver wd;
	
	public static WebDriver startBrowser(String bname,String url)
	{
		if(bname.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			wd=new FirefoxDriver();
		}
		wd.get(url);
		return wd;
	}

}
