package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
	@FindBy(xpath="")
	WebElement wlcTextElement;
	
	public void verifyWelcometxt(String strExpectedWlcTxt) {
		
		Assert.assertEquals("wlcTextElement", "strExpectedWlcTxt");
	}
}
