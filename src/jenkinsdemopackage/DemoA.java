package jenkinsdemopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void testA(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}

}	 
