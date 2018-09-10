package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		/*
		 * driver.get("http://jqueryui.com/droppable/"); driver.switchTo().frame(0); //
		 * Switch to Frame if its presents Actions action = new Actions(driver);
		 * action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		 * .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release(
		 * ).build().perform();
		 */

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		// Element which needs to drag.
		//First, we capture the 1st element which we need to drag in variable "Source."
		WebElement Source = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element on which need to drop.
		//we capture the 2nd element on which we need to drop the 1st element in variable "Destination".
		WebElement Destination = driver.findElement(By.xpath("//*[@id='bank']/li"));

		//we create object of Actions class as we use methods of Actions class.
		//Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(Source, Destination).build().perform();
	
	}
}
