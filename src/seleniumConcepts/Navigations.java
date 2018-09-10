	package seleniumConcepts;
	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class Navigations {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); //Launch FireFox Browser
			
			driver.manage().window().maximize();  //Maximize the window.
			driver.manage().deleteAllCookies(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //Wait For Page To Load
			
			driver.get("https://www.google.com/");
		    driver.navigate().to("https://www.amazon.in/");//navigate().to()---used for launch the External URL
			
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().back();
			
			/*Methods which are followed by Navigation Keyword.
			  driver.navigate().back();
			  driver.navigate().forward();
			  driver.navigate().refresh();
			  driver.navigate().to(String args[]);
			  driver.navigate().to(URL args[]);
			*/
	
		}
	}
	
