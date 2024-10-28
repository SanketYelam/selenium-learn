package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(id="customer_email")
	private WebElement userName;
	
	@FindBy(id="customer_password")
	private WebElement password;
	
	@FindBy(id="customer_login")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@href]")
	private List<WebElement> links;
	
	public LoginPage() {//constructor function//initialize web element
		PageFactory.initElements(WebDriverFactory.getDriver(), this);

	}
	public HomePage login(String strUserName , String strPassword) {
		
		userName.sendKeys("admin");
		password.sendKeys("admin123");
		loginButton.click();
		
		HomePage hp = new HomePage();
		
		return hp;
	}
	
	public LoginPage loginWithEmptyData(String strUserName , String strPassword) {
		
		userName.clear();
		password.clear();
		loginButton.click();
		
		return this;
	}
	
	public LoginPage printLinks() {
		  for (WebElement link:links) {
		    	System.out.println(link.getAttribute("href"));
		    }
		    
		return this;
	}
	
	
}
