package test;

import org.testng.annotations.Test;

import pages.ClientsPage;
import pages.LoginPage;
import pages.PaginationPage;

public class PaginationTest extends Base {
  @Test
  public void verifypagination() throws InterruptedException {
	  
	  LoginPage log=new LoginPage(driver);
	  log.setusername("carol");
	  log.setpassword("1q2w3e4r");
	  log.loginclick();
	  
	  PaginationPage p=new PaginationPage(driver);
	  p.clientlinkclick();
	  
	  p.pageNumAllNextClk();
	  
	  
  }
}
