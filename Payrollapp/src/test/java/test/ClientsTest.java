package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ClientsPage;
import pages.LoginPage;

public class ClientsTest extends Base {
  @Test
  public void verifyClient() throws InterruptedException {
	  
	  LoginPage log=new LoginPage(driver);
	  log.setusername("carol");
	  log.setpassword("1q2w3e4r");
	  log.loginclick();
	  
	  ClientsPage client=new ClientsPage(driver);
	  client.clientlinkclick();
	  client.setclientsearchname();
	  client.setclientid();
	  client.searchclick();
	                            //  client.resetclick();
	  Thread.sleep(2000);
	  client.setview();
	  
	  String expected[]= {"asrda","Eastbourn1","The Vines","118","Innhams Wood\n" + "Crowborough\n" + "East Sussex","TN6 1TE"};
	  String act[]=client.setassertviewvalues();
	  Assert.assertEquals(act,expected);
	 
	  client.clientlinkclick();
	  client.setclientsearchname();
	  client.setclientid();
	  client.searchclick();
	  Thread.sleep(2000);
	  client.setupdate();
	  client.setedit();
	  
	  String expected1="11";
	  String act1=client.setassert();
	  Assert.assertEquals(act1, expected1);
	 }
	 
}
