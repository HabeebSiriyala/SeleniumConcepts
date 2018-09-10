package seleniumConcepts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
	public static void main(String[] args) throws InterruptedException {
		/* 
		HtmlUnitDriver is not Available in Selenium 3.x version
	    HtmlUnitDriver ---- to use this concept, we have to download HtmlUnitDriver
		JAR File
		 */
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize(); // maximize the Window
		driver.manage().deleteAllCookies(); // delete All Cookies
		// dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/* Advantages::::
		1.Testing is happening behind the Scene-----No browser is launched
		2.very fast--Execution of test cases--very fast--performance of the script
		3.Not Suitable for Action Class--User Actions---mousemovements,DoubleClick, DragAndDrop
		4.Ghost Driver --Headless Driver
		diff Headless Drivers Available in the market
		1.HtmlUnitDriver----java
		2.PhantomJS---JavaScript
		*/
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("Before Login, title is: ===" + driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("After Login, title is: ===" + driver.getTitle());
	}
}
