package Dummy2.UdemyTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Constants.Constants;


import objectRepository.LoginPage;

import resources.BaseClass;

public class LoginTest extends BaseClass {
	public WebDriver driver;
	List<String> userList = new ArrayList<String>();

	String user;
	
	@BeforeTest
	public void loginTest() throws IOException {
		
		driver = intializeDriver();
	}
	
	@Test
	public void login() {
		driver.get(prop.getProperty("url"));
		LoginPage loginObj = new LoginPage(driver);

		String usersname = loginObj.getUserList().getText();
		String pass = loginObj.getUserPass().getText();
		String[] passarray = pass.split(":");

		String[] words = usersname.split("\n");
		user = words[1];
		loginObj.getUserName().sendKeys(words[1]);
		loginObj.getPassword().sendKeys(passarray[1]);
		loginObj.getLoginBtn().click();

	}
	
	public WebDriver loginWebdriver() {
		
		return driver;
	}
	
	
}
