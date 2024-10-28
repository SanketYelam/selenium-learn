package test_cases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseSeleniumTest;
import common.IInvokedMethodListenerImpl;
import common.WebDriverFactory;
import pages.HomePage;
import pages.LoginPage;

// @Listeners(IInvokedMethodListenerImpl.class)
public class LoginTest extends BaseSeleniumTest {

  // @Test
  public void verifyUserAbleToLogin() {
    //   LoginPage lp = new LoginPage();
    //   lp.login("admin", "admin123");

    //   HomePage hp = new HomePage();
    // hp.verifyWelcometxt("Welcome Paul");

    LoginPage lp = new LoginPage();
    lp.login("admin", "admin123").verifyWelcometxt("Welcome Admin"); // object chaining

    // WebDriverFactory.getDriver().switchTo().alert();
    // .dismiss();
    // WebDriverFactory.getDriver().switchTo().alert().sendKeys("Hi");
    // alert
  }

  // @Test(dataProvider="CSVDataProvide")
  public void verifyUserAbleToLoginSuccesfully(String userName, String password) {

    LoginPage lp = new LoginPage();
    lp.login("userName", "password");
  }

  @Test
  public void checkLinkOnPage() {
    LoginPage lp = new LoginPage();
    lp.printLinks();
  }
}
