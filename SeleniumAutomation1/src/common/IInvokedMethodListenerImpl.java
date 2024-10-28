package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {

  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
    WebDriverFactory.getDriver().quit();
    IInvokedMethodListener.super.afterInvocation(method, testResult, context);
  }

  @Override
  public void beforeInvocation(
      IInvokedMethod method, ITestResult testResult, ITestContext context) {

    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
    WebDriverFactory.setDriver(new ChromeDriver());
    WebDriverFactory.getDriver().manage().window().maximize();
    WebDriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");
    IInvokedMethodListener.super.beforeInvocation(method, testResult, context);
  }
}
 