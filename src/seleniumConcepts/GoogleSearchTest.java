package seleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser
		driver.manage().window().maximize(); // maximize the Window
		driver.manage().deleteAllCookies(); // delete All Cookies

		// dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com/"); // enter URL
		driver.findElement(By.id("lst_ib")).sendKeys("java");

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));

		System.out.println("total number of suggestions in search box:::====>" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("java tutorial")) {
				list.get(i).click();
				break;
			}
		}

	}

}
