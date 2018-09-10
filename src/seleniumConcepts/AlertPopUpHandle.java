package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Enter Url
		driver.findElement(By.name("proceed")).click(); // click on go button
		Thread.sleep(2000);

		/* In Selenium We have Alert API's are Available & Alert interface is Available
		   We have to use driver.switchTo().alert() method 
		   which will return one alert interface reference variable 
		   And with that Reference variable we have that method
		   .accept() .dismiss() .getText() methods
		   
		   .accept() method----will click on ok button
		   .dismiss() method----will click on cancel or close button
		   .getText() method----will give u the text of that Particular Alert.
		*/
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();

		// validation For Alert
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert Message");
		} else {
			System.out.println("In-Correct Alert Message");
		}

		alert.accept(); // click on OK Button
		// alert.dismiss(); // Click on cancel Button
	}
}
