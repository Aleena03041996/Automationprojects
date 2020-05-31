package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateclientsPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientlink;
	
	@FindBy(xpath="//a[text()='Create Client']")
	WebElement createclientlink;
	
	@FindBy(name="Client[branch_id]")
	WebElement branch;
	
	@FindBy(name="Client[division_id]")
	WebElement division;
	
	@FindBy(id="client-client_name")
	WebElement clientname;
	
	@FindBy(id="client-client_address")
	WebElement clientaddress;
	
	@FindBy(id="client-postcode")
	WebElement postcode;
	
	@FindBy(id="client-country")
	WebElement country;
	
	@FindBy(id="client-your_ref")
	WebElement ref;
	
	@FindBy(id="client-invoice_contact")
	WebElement invoicecontact;
	
	@FindBy(id="client-phone")
	WebElement phone;
	
	@FindBy(id="client-fax")
	WebElement fax;
	
	@FindBy(id="client-email")
	WebElement email;
	
	@FindBy(id="client-company_reg")
	WebElement companyreg;
	
	@FindBy(name="Client[invoice_order]")
	WebElement invoiceorder;
	
	@FindBy(name="Client[invoice_delivery_method]")
	WebElement deliverymethod;
	
	@FindBy(name="Client[master_document]")
	WebElement masterdocument;
	
	@FindBy(id="client-settilement_days")
	WebElement settdays;
	
	@FindBy(name="Client[vat_rate]")
	WebElement vatrate;
	
	@FindBy(xpath="//input[@id='client-require_po']")
	WebElement dc;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement savebut;
	
	@FindBy(xpath="//table[@id='w0']//tr//td")
	List<WebElement> colvalues;
	
	public CreateclientsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clientlinkclick()
	{
		clientlink.click();
	}
	
	public void createclientlinkclick()
	{
	   createclientlink.click();
	}
	
	public void setbranch()
	{
		Select ob=new Select(branch);
		ob.selectByVisibleText("Eastbourn1");
	}
	
	public void setdivision()
	{
		Select ob1=new Select(division);
		ob1.selectByValue("1");
	}
	
	public void setclientname()
	{
		clientname.sendKeys("asiatic");
	}
	
	public void setclientaddress()
	{
		clientaddress.sendKeys("near kazhakootam,trivandrum");
	}
	
	public void setpostcode()
	{
		postcode.sendKeys("6600");
	}
	
	public void setcountry()
	{
		country.clear();
		country.sendKeys("India");
	}
	
	public void setref()
	{
		ref.sendKeys("500");
	}
	
	public void setinvoicecontact()
	{
		invoicecontact.sendKeys("111");
	}
	
	public void setphone()
	{
		phone.sendKeys("99900077755");
	}
	
	public void setfax()
	{
		fax.sendKeys("7777");
	}
	
	public void setemail()
	{
		email.sendKeys("aaa@gmail.com");
	}
	
	public void setcompanyreg()
	{
		companyreg.sendKeys("def");
	}
	
	public void setinvoiceorder()
	{
		Select ob2=new Select(invoiceorder);
		ob2.selectByIndex(4);
	}
	
	public void setdeliverymethod()
	{
		Select ob3=new Select(deliverymethod);
		ob3.selectByVisibleText("Electronic");
	}
	
	public void setmasterdoc()
	{
		Select ob4=new Select(masterdocument);
		ob4.selectByValue("Print");
	}
	
	public void setsettiledays()
	{
		settdays.sendKeys("10");
	}
	
	public void setvatrate()
	{
		Select ob5=new Select(vatrate);
	    ob5.selectByIndex(3);
	}
	
	public void setdirectclient()
	{
		dc.click();
	}
	
	public void savebutton()
	{
		savebut.submit();
	}
	
	public String[] columnvalues()
	{
		String act[]=new String[6];
		for(int i=0;i<6;i++)
		{
			act[i]=colvalues.get(i).getText();
		}
		return act;
	}
	
	
	}
