package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By logoutBtn = By.id("logout_sidebar_link");
	private By homebarBtn = By.id("react-burger-menu-btn");
	//private By items = By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory']");
	private By selectItems =  By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory']");
	private By cartStatus = By.className("shopping_cart_badge");
	private By cartBtn = By.xpath("//div[@class='shopping_cart_container']/child::a");
	
	public WebElement logoutBtn() {
		return driver.findElement(logoutBtn);
	}
	
	public WebElement homebarBtn() {
		return driver.findElement(homebarBtn);
	}
	
	public List<WebElement> selectitem() {
		return driver.findElements(selectItems);
	}
	
	public WebElement cartStatus() {
		return driver.findElement(cartStatus);
	}
	//Helloooooo
	public WebElement cartBtn() {
		return driver.findElement(cartBtn);
	}
	

}
