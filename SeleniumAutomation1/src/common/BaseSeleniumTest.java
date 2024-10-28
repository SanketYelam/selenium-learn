package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseSeleniumTest {

  @BeforeMethod
  public void beforeEveryTest() {

    System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
    WebDriverFactory.setDriver(new ChromeDriver());
    WebDriverFactory.getDriver().manage().window().maximize();
    WebDriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");
  }

  @AfterMethod
  public void afterEveryTest() {
    WebDriverFactory.getDriver().quit();
  }

  @DataProvider(name = "LoginData")
  public String[][] getLoginData() {
    String data[][] = {
    		{"admin ", "admin123"},
    		{"ESS", "admin"},
    		{"adm", "admin"}
    		               };//multi dimensional array

    return data;
  }

  @DataProvider(name = "CSVDataProvide")
  public String[][] getDataCSVFilr() throws IOException {
    
    File file = new File("C:\\Users\\SANKET\\eclipse-workspace-selenium\\SeleniumAutomation1\\src\\common\\LoginTest.txt");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    
    String line;
    
    String loginData [] []=new String[3][3];
    
    int i=0;
    
    while((line=br.readLine())!=null) {
    	System.out.println(line);
    	
    	String[] lineArray =line.split(",");
    	loginData[i]=lineArray;
    	i=i+1;
    	System.out.println("");
    }
    
    return loginData;
  }
}
