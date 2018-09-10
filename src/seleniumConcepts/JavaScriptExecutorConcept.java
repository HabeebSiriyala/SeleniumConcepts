package seleniumConcepts;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser

		driver.manage().window().maximize(); // maximize the Window

		driver.manage().deleteAllCookies(); // delete All Cookies

		// dynamic Wait
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		// driver.findElement(By.xpath("//input[@type='submit']")).click();

		// executeScript-----------To execute javaScript Code

		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); // Login button

		flash(loginBtn, driver); // highlight the element

		drawBorder(loginBtn, driver); // draw a border

		// take a screenshot
		// take screenshot and store as a file format
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now Copy the screenshot to desired location using copyFile //method
		// The below method will save the screen shot in d drive with name
		// "screenshot.png"
		FileUtils.copyFile(scrFile,
				new File("C:\\Users\\USER\\workspace\\Selenium3\\src\\seleniumConcepts\\screenshot11.png"));

		// generate Alert
		// generateAlert(driver, "there is an issue with Login button on Login page");

		// click on any Element by using JS Executor
		clickElementByJS(loginBtn, driver);

		// refresh the page
		// 1.By using the selenium
		driver.navigate().refresh();
		// 2.By using JS Executor
		refreshBrowserByJS(driver);

		// Get the title of the page by js
		System.out.println(getTitleByJS(driver));

		// get the page text
		System.out.println(getPageInnerText(driver));

		// scroll page down
		// scrollPageDown(driver);

		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot Password?')]"));
		scrollIntoView(forgotPwdLink, driver);
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver); // 1
			changeColor(bgcolor, element, driver); // 2
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor ='" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}

	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px Solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText").toString();
		return pageText;
	}

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
