package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	private WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
 private By items = By.xpath("//div[@class='cart_item_label']/child::a");
 
 public List<WebElement> getItems() {
	 return driver.findElements(items);
 }
 
}
