package seleniumConcepts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://jqueryui.com/");
		// 1.get the total count of links on the page
		// 2.get the text of each link on the page
		// All the links are represented by <a> html tag

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		// size of the linklists
		System.out.println(linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
	}
}
