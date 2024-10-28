package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		
		WebElement userRoleElement = driver.findElement(By.id("systemUser_userType"));
		
		Select userRoleSelect = new Select(userRoleElement);
		
		//three methods
		
		userRoleSelect.selectByIndex(0); //index in dropdown can be chnaged
		userRoleSelect.selectByValue("2");  // for specific text
		userRoleSelect.selectByVisibleText("Admin"); //casesensitive
		
		
		
	}
}
