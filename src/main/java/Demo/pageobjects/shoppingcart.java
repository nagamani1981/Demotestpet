package Demo.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demo.AbstractComponents.AbstractComponents;

public class shoppingcart extends AbstractComponents {
	WebDriver driver;
	public shoppingcart(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table/tbody/tr")
	
	List<WebElement> val;
	//By vals= By.xpath("//table/tbody/tr");
	public void sumup()
	{
		System.out.println(val.size());
		float sum=0;
		for (int i=1;i<=val.size();i++) {
			System.out.println(val.get(i).getText());
			if(i<val.size()-1) {
				int j=i+1;
				String sample6=driver.findElement(By.xpath("//table[1]/tbody[1]/tr["+j+"]/td[7]")).getText();
				System.out.println(sample6);
				String sample3=sample6.substring(1);
				float sample5=Float.parseFloat(sample3);
				System.out.println(sample5);
				sum=sum+sample5;
				//System.out.println(sum);
			}
			else if(i==val.size()) {
				/*String sample2=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText();
				String sample4=sample2.substring(1);
				float sample6=Float.parseFloat(sample4);
		        System.out.println(sample4);*/
				String[] total=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText().split(" ");
				String sample2=(total[2]);
				String num2=sample2.substring(1);
				float sumTotal=Float.parseFloat(num2);
				System.out.println(sumTotal);
		     if(sumTotal==sum) {
		    	 System.out.println("Success");
		     }
	}
}
}
}