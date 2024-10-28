package test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerificationTest {
	public static void main(String [] args) throws InterruptedException {
		//System.out.println("*******beforeInvocation called");
	    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
	    
	    ChromeDriver driver = new ChromeDriver();
	    
	  
	    driver.get("https://sauce-demo.myshopify.com/account/login");
	    
	    Thread.sleep(3000);
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    for (WebElement link:links) {
	    	//System.out.println(link.getAttribute("href"));
	    	
	    	System.out.println(link.getText());
	    }
	    
}
	 
}
