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
		Addtocart cat= landing.enterstore_click();
		cat.cat_add_to_cart();
		cat.mainmenu();
		//cat.parrot_add_to_cart();		
		fish fi=cat.parrot_add_to_cart();
		//fi.fish_menu_click();
		shoppingcart shop=fi.fish_menu_click();
		shop.sumup();	
		
	}

}
