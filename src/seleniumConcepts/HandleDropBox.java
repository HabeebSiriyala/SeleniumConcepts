package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  // Enter Url
		
		//Handle Drop Box 
		Select select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText("India");
		
		//you must first import the org.openqa.selenium.support.ui.Select package
		//and then create a Select instance.
		/*Import the package---------org.openqa.selenium.support.ui.Select
		  Instantiate the drop-down box as a "Select" object in WebDriver
		  
		  The following are the most common methods used on drop-down elements.
		  selectByVisibleText()----Selects an option by its displayed text
		  selectByValue()----Selects  an option by the value of its "value" attribute
		  selectByIndex()----Selects an option by its index
		  isMultiple()----Returns TRUE if the drop-down element allows multiple selections at a time
		  deselectAll()----deselects all previously selected options
		 */
		
	}
}

