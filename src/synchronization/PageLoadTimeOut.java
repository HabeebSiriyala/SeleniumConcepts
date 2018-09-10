package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PageLoadTimeOut {

	static WebDriver driver;

	@Test
	public void main() {
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver(); // Launch FireFox Browser

		// Page Load Time Out
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

	}

	@AfterTest
	public void close() {
		driver.quit();
	}
}
