package Demo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demo.AbstractComponents.AbstractComponents;

public class fish extends AbstractComponents {
	
	WebDriver driver;
	public fish(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id='SidebarContent']/a[1]/img[1]")
	WebElement fish;
	
	@FindBy(xpath="//a[contains(text(),'FI-SW-01')]")
	WebElement fishmenu;
	
	@FindBy(xpath="//a[contains(text(),'Add to Cart')]")
	WebElement Addtcart;

	/*public void fish_click() throws InterruptedException
	{
	fish.click();
	
		
	}*/
	public shoppingcart fish_menu_click() throws InterruptedException
	{
		fish.click();
		fishmenu.click();
		Addtcart.click();
		shoppingcart shop=new shoppingcart(driver);

		return shop;
	}


}
