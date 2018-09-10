package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register/"); // enter URL
		// 1. isDisplayed() method: Applicable for all the elements
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); // for Submit Button
		System.out.println(b1); // true
		// 2. isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); // false
		// Select I agree checkbox
		driver.findElement(By.name("agreeTerms")).click(); // ----Submit button is Enabled now
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3); // true
		// 3. isSelected() method:
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4); // true
		// de-select the checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5); // false
	}
}
