package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Shubhangi_Gaikwad\\eclipse-workspace\\UdemyTesting\\src\\main\\java\\resources\\Data.properties");
		prop.load(file);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubhangi_Gaikwad\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		return driver;
	}

}
