package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CreateclientsPage;
import pages.LoginPage;

public class CreateclientsTest extends Base{
  @Test(priority=1)
  public void verifyCreateclient() {
	  
	  LoginPage log=new LoginPage(driver);
	  log.setusername("carol");
	  log.setpassword("1q2w3e4r");
	  log.loginclick();
	  
	  CreateclientsPage create=new CreateclientsPage(driver);
	  create.clientlinkclick();
	  create.createclientlinkclick();
	  create.setbranch();
	  create.setdivision();
	  create.setclientname();
	  create.setclientaddress();
	  create.setpostcode();
	  create.setcountry();
	  create.setref();
	  create.setinvoicecontact();
	  create.setphone();
	  create.setfax();
	  create.setemail();
	  create.setcompanyreg();
	  create.setinvoiceorder();
	  create.setdeliverymethod();
	  create.setmasterdoc();
	  create.setsettiledays();
	  create.setvatrate();
	  create.setdirectclient();
	  create.savebutton();
	  
	  String exp[]= {"asrda","Eastbourn1","asiatic","500","near kazhakootam,trivandrum","6600"};
	  String act[]=create.columnvalues();
	  Assert.assertEquals(act,exp);
	  
	 }
  }

