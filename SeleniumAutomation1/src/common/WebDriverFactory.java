package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	
	private static ThreadLocal<WebDriver>threadLocalStorage =new ThreadLocal<WebDriver>();//driver per thread

//  private static ChromeDriver driver;

  public static WebDriver getDriver() {
   // return driver;
	  
	  return threadLocalStorage.get();
  }

  public static void setDriver(ChromeDriver localDriver) {
    //driver = localDriver;
	  threadLocalStorage.set(localDriver);
  }
}
