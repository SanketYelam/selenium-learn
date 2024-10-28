package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest {

 
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");

    ChromeDriver chrome = new ChromeDriver();
    
    chrome.get("https://sauce-demo.myshopify.com/account/login");

    WebElement email = chrome.findElement(By.id("customer_email"));
    email.sendKeys("iam.sanketyelam@gmail.com");

    WebElement password = chrome.findElement(By.id("customer_password"));
    password.sendKeys("admin123");

    // WebElement loginButton = chrome.findElement(By.className(null));
    // loginButton.click();

    WebElement form = chrome.findElement(By.id("customer_login"));

    boolean isDisplayed = form.isDisplayed();
    System.out.println(isDisplayed);
    System.out.println(chrome.getCurrentUrl());
    System.out.println(chrome.getTitle());

    if (isDisplayed == true) {
      System.out.println("test pass");
    } else {
      System.out.println("test failed");
    }

    WebElement welcomeText = chrome.findElement(By.id("welcome"));
    // method 1
    String strActualWelcomeText = welcomeText.getText();

    if (strActualWelcomeText.contentEquals("Welcome")) {

    } else {

    }
    // method 2
    Assert.assertEquals("strAtualWelcomeText", "Welcome");

    /*
    if (form.getText().contains("")) {

    }
    else {

    }
    */
    // chrome.quit();
  }
}
