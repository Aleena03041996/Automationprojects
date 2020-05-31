package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationPage {
	
	WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientlink;
	
	@FindBy(xpath="//ul[@class='pagination']//li[@class='next']//a")
	WebElement pagenextlink;
	
	@FindBy(xpath="//ul[@class='pagination']//li[@class='prev']//a")
	WebElement pageprevlink;
	
	public PaginationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clientlinkclick()
	{
		clientlink.click();
	}
	
	public void pageNumAllNextClk() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		while(pagenextlink.isEnabled())
		{
			String nextpath="//ul[@class='pagination']//li[@class='next']//a";
			WebDriverWait wait=new WebDriverWait(driver,60);
			WebElement paginatebutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(nextpath)));
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
          js.executeScript("window.scrollBy(0,1400)");
          if(paginatebutton.isEnabled())
          {
        	  paginatebutton.click();
        }
          else if(!paginatebutton.isEnabled())
          {
        	 System.out.println("not enabled"); 
          }
		}
	}
	
	}
