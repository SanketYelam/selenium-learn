package orange_hrm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSeleniumTest {
	 ChromeDriver chrome;//global var

	  @BeforeMethod
	  public void beforeEveryTest() {

	    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
	    chrome = new ChromeDriver();
	    chrome.get("https://sauce-demo.myshopify.com/account/login");
	  }

	  @AfterMethod
	  public void afterEveryTest() {
	    chrome.quit();
	  }


}
