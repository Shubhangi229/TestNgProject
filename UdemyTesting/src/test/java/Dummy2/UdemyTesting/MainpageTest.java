package Dummy2.UdemyTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Constants.Constants;


import objectRepository.MainPage;


public class MainpageTest extends LoginTest {

	public WebDriver mainPageDriver;
	 MainPage mpObj;
	 List<String> cartitems;
	
	
	@BeforeTest
	public void initializeMainPageTest() throws IOException {
		
		//loginTest();
		//login();
		mainPageDriver = loginWebdriver();
	
	}
	
	
	@Test
	public void clickintoCart() {
		mpObj = new MainPage(mainPageDriver);
		cartitems = new ArrayList<String>();
		List<WebElement> cartitemsList = mpObj.selectitem();
		
		for(WebElement it : cartitemsList ){
			cartitems.add(it.getText());
			it.click();
		  
		}
	
	}
	@Test(dependsOnMethods = "clickintoCart")
	public void checkStatusOfCart() {
		int selectItems = Integer.parseInt(mpObj.cartStatus().getText());
		
		Assert.assertEquals(selectItems,cartitems.size());
		
	}
	
	@Test(dependsOnMethods = "checkStatusOfCart")
	public void clickcartBtn() {
		mpObj.cartBtn().click();
	}
	
	
	
     public WebDriver mainpageWebdriver() {
		
		return mainPageDriver;
	}
}
