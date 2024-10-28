package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");

    ChromeDriver chrome = new ChromeDriver();

    chrome.get("https://sauce-demo.myshopify.com/account/login");

    WebElement email = chrome.findElement(By.xpath("//*[@id=\"customer_email\"]"));
    email.sendKeys("iam.abc@gmail.com");

    WebElement password = chrome.findElement(By.xpath("//*[@id=\"customer_password\"]"));
    password.sendKeys("admin123");

    WebElement signin = chrome.findElement(By.xpath("//*[@id=\"customer_login\"]/div[5]/input"));
    signin.click();
    
    WebElement btnSubmit = chrome.findElement(By.xpath("//*[@id=\"page-content\"]/div/form/input[3]"));
    btnSubmit.click();

    System.out.println(chrome.getTitle());
  }
}
