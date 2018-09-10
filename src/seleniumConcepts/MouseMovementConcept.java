package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='header-addons']/ul/li[11]/a")).click();
		
		/*create an object ‘action‘ of Selenium Actions class:

			Actions action=new Actions(driver);
			To focus on element using WebDriver:


			action.moveToElement(element).perform();
			element is the webelement which we capture

			perform() method is used here to execute the action.

			To click on the element:
			action.moveToElement(element).click().perform();
			
			click() method is used here to click the element.*/
		
		
/*Keyboard Events Using Selenium Actions Class API:
 
The Keyboard interface has the below mentioned methods:
sendKeys(keysToSend) : sends a series of keystrokes onto the element
keyDown(theKey) : Sends a key press without release it. 
Subsequent actions may assume it as pressed. (example: Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
keyUp(theKey): Performs a key release

Mouse Events Using Selenium Actions Class API:

click (): Simply click on element
doubleClick (): Double clicks onElement
contextClick() : Performs a context-click (right click) on an element
clickAndHold(): Clicks at the present mouse location (without releasing)

dragAndDrop(source, target): Invokes click-and-hold at the source location and moves to the location of the target element 
before releasing the mouse. source – element to grab, target – element to release

dragAndDropBy(source, xOffset, yOffset) : Performs click-and-hold at the source location, shifts by a given offset, 
then frees the mouse. xOffset – to shift horizontally, yOffset – to shift vertically

moveByOffset(x-offset, y-offset): Shifts the mouse from its current position (or 0,0) by the given offset. 
x-offset – Sets the horizontal offset (negative value – shifting the mouse to the left),
 y-offset – Sets the vertical offset (negative value – shifting the mouse to the up)
 
moveToElement(toElement): It shifts the mouse to the center of the element

release(): Releases the depressed left mouse button at the existing mouse location

		 */
		


	}
}

