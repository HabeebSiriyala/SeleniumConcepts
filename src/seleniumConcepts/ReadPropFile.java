package seleniumConcepts;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\USER\\workspace\\Selenium3\\src\\seleniumConcepts\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName =  prop.getProperty("browser");
				
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {

			System.setProperty("webdriver.gecko.driver", "C:\\habeeb\\Selenium\\geckodriver-v0.20.1-win32 (1)\\geckodriver.exe");

			driver = new FirefoxDriver();
		}else if (browserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver","C:\\habeeb\\Selenium\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath "))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath "))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("emailaddress_xpath "))).sendKeys(prop.getProperty("emailaddress"));
		
		
	}
}

