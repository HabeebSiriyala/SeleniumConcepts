package seleniumConcepts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser
		// --------Maximize the window.
		driver.manage().window().maximize();

		// ------Deleting all the cookies of the domain
		driver.manage().deleteAllCookies();

		// -----------it opens the site url
		driver.get("https://www.ebay.com/");

		// --------Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
