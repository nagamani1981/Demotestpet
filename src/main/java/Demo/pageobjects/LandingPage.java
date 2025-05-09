package Demo.pageobjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import Demo.AbstractComponents.AbstractComponents;


public class LandingPage extends AbstractComponents {
	WebDriver driver;

	//PageFactory
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	
	
	
	
	public void launchURL()
	{
		driver.get("https://petstore.octoperf.com");
		
//		enterstore.
		
	}
	


}
