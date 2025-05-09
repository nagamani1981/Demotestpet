 package Demo.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demo.AbstractComponents.AbstractComponents;

public class Addtocart extends AbstractComponents  {
	WebDriver driver;
	public Addtocart(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//div[@id='SidebarContent']/a[3]/img[1]")
	WebElement cats ;
	@FindBy(xpath="//a[contains(text(),'FL-DSH-01')]")
	WebElement catmenu;
	@FindBy(xpath="//tbody/tr[2]/td[5]/a[1]")
	WebElement addtocartbutton;
	@FindBy(xpath="//div[@id='SidebarContent']/a[5]/img[1]")
	WebElement parrot ;
	@FindBy(xpath="//a[contains(text(),'AV-CB-01')]")
	WebElement parrotmenu;
	
	
	//driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]")).click();
	public void cat_add_to_cart()
	{
		cats.click();
		catmenu.click();
		addtocartbutton.click();
	}
	public fish parrot_add_to_cart()
	{
		parrot.click();
		parrotmenu.click();
		addtocartbutton.click();
		fish fi=new fish(driver);
		return fi;
	}
	
}
