package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Base {
	public WebDriver driver;
 
  @BeforeClass
  
 public void setup() {
		  
		  WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.qabible.in/payrollapp/site/login");
			driver.manage().window().maximize();
		  }
	  
  @AfterClass
  public void afterClass() {
  }

}
