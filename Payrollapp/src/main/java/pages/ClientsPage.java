package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientlink;
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientname;
	
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientid;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbut;
	
	//@FindBy(xpath="//button[@type='reset']")
	//WebElement resetbut;
	
	@FindBy(xpath="//a[@title='View'and @data-pjax='0']")
	WebElement viewclick;
	
	@FindBy(xpath="//a[@title='Update']")
	WebElement updateclick;
	
	@FindBy(id="client-settilement_days")
	WebElement settdays;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement savebut;
	
	@FindBy(xpath="//table[@id='w0']//tr[17]//td")
	WebElement settviewpage;
	
	@FindBy(xpath="//table[@id='w0']//tr//td")
	List<WebElement> assertviewvalues;
	
	public ClientsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clientlinkclick()
	{
		clientlink.click();
	}
	
    public void setclientsearchname()
    {
    	 clientname.sendKeys("The Vines");
    }
    
    public void setclientid()
    {
    	clientid.sendKeys("6");
    }
    
    public void searchclick()
    {
    	searchbut.click();
    }
    
   // public void resetclick() 
   // {
    	
    	//resetbut.click();
   // }
    
    public void setview()
    {
    	viewclick.click();
     }
    
    public String[] setassertviewvalues()
	{
		String act[]=new String[6];
		for(int i=0;i<6;i++)
		{
			act[i]= assertviewvalues.get(i).getText();
		}
		return act;
	}
    
    
    
    public void setupdate()
    {
    	updateclick.click();
    }
    
    public void setedit()
    {
    	settdays.clear();
    	settdays.sendKeys("11");
    	savebut.submit();
    }
    
    public String setassert()
    {
    	String act=settviewpage.getText();
    	return act;
    }
    }
