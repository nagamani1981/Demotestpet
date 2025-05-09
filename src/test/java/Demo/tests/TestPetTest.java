package Demo.tests;

import java.io.IOException;


import org.testng.annotations.Test;

import Demo.TestComponents.BaseTest;
import Demo.pageobjects.Addtocart;

import Demo.pageobjects.fish;
import Demo.pageobjects.shoppingcart;



public class TestPetTest extends BaseTest{
	
	@Test
	public void sampletestpet() throws IOException, InterruptedException
	{
		
		
		//com.waitsample();
		
		//com.waitsample();
		//Thread.sleep(5000);
		
		Addtocart cat= landing.enterstore_click();
		cat.cat_add_to_cart();
		cat.mainmenu();
		cat.parrot_add_to_cart();
		cat.mainmenu();
		fish fi=cat.parrot_add_to_cart();
		//fi.mainmenu();
		//fi.fish_click();
		
		fi.fish_menu_click();
		
		shoppingcart shop=fi.fish_menu_click();
		shop.sumup();
				
		
				
	}

}
