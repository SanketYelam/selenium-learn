package test_cases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {

  public static void main(String[] args) throws InterruptedException {
    // System.out.println("*******beforeInvocation called");
    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");

    ChromeDriver driver = new ChromeDriver();

    driver.get("https://sauce-demo.myshopify.com/account/login");

    Thread.sleep(3000);

    List<WebElement> links = driver.findElements(By.tagName("a"));

    for (WebElement link : links) {

      link.click();
    }

    String currentWindowHandle = driver.getWindowHandle();
    Set<String> allOpendWindowsByDriver = driver.getWindowHandles();

    for (String windowHandle : allOpendWindowsByDriver) {

      if (!currentWindowHandle.contains(windowHandle)) {
        System.out.println("Window handle :" + windowHandle);
        driver.switchTo().window(windowHandle);
        System.out.println(driver.getTitle());
        driver.close();
      }
      driver.switchTo().window(currentWindowHandle);
      System.out.println(driver.getTitle());
      driver.close();
    }
  }
}
