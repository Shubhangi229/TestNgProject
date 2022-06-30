package Dummy2.UdemyTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.CartPage;

public class OpenCart extends MainpageTest {
	public WebDriver cartdriver;
	CartPage cartPageDriver;
	@BeforeTest
	public void initializeCartPage() throws IOException {
		
		cartdriver = mainpageWebdriver();
		
		cartdriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void selectAllItems() {
		cartPageDriver = new CartPage(cartdriver);
		List<WebElement> itemsList = cartPageDriver.getItems();
		List<String> items = new ArrayList<String>();
		
		for(WebElement it : itemsList) {
			it.click();
			cartdriver.navigate().back();
			//items.add(it.getAttribute("href"));
			
		}
	}
	
	
	

}
