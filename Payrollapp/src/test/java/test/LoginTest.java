package test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Excelcode;

public class LoginTest extends Base {
  @Test(dataProvider="logintestdata")
  public void verifyLogin(String username,String password) {
	  LoginPage log=new LoginPage(driver);
	  
	  boolean b=log.setenableuser();
	  System.out.println("b is" +b);
	  Assert.assertTrue(b,"failed enable");
	  log.setusername(username); 
	  
	 
	  boolean b1=log.setenablepassword();
	  System.out.println("b1 is" +b1);
	  Assert.assertTrue(b1,"failed enable");            // log.setusername("carol");
	  log.setpassword(password);                        //log.setpassword("1q2w3e4r");
	  
	  log.loginclick();
	  
	  try {
		  Thread.sleep(1000);
	  }
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  
	  String expected="Payroll Application";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected);
	  }
	  
	  @BeforeMethod
	  public void beforeMethod()
	    {
	 	 driver.get("https://www.qabible.in/payrollapp/site/login");
	  }
	   
	   @DataProvider
	  public Object[][] logintestdata() throws InvalidFormatException, IOException 
	   {
	 	 Object[][] data=Excelcode.getDataFromSheet("C:\\Users\\DREAM\\Documents\\Payrolllogin.xlsx");
	      return data;
	  }
	  }

