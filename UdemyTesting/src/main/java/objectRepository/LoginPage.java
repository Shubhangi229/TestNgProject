package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	private By userName = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button");
	private By usernamesList = By.xpath("//div[@id='login_credentials']");
	private By userPassword = By.className("login_password");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserName() {
		return driver.findElement(userName);
	}
		
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement getUserList() {
		return driver.findElement(usernamesList);
	}
 
	public WebElement getUserPass() {
	    
		return driver.findElement(userPassword);
	}
}
