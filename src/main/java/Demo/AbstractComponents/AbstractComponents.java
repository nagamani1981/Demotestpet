package Demo.AbstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demo.pageobjects.Addtocart;

public class AbstractComponents {
	WebDriver driver;
	
	public AbstractComponents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Enter the Store')]")
	WebElement enterstore;
	@FindBy(xpath="//a[contains(text(),'Return to Main Menu')]")
	WebElement mainmenu;
	
	
	public void mainmenu()
	{
		mainmenu.click();
	}
	
	
	
	public Addtocart enterstore_click()
	{
		enterstore.click();
		Addtocart cat=new Addtocart(driver);
		return cat;
		
		
	}


	public void waitsample() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	

}
