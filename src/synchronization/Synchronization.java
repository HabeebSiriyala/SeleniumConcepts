package synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver(); // Launch FireFox Browser

		// Page Load Time Out
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));

		// Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)

				// Waiting 30 seconds for an element to be present on the page, checking
				.withTimeout(30, TimeUnit.SECONDS)

				// for its presence once every 5 seconds.
				.pollingEvery(5, TimeUnit.SECONDS)

				.ignoring(NoSuchElementException.class);

		// Thread.sleep()
		Thread.sleep(3000);

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}