package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsConcept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  // Enter Url
		
		// 1.Xpath
		// Absolute Xpath should not be used -----html/body/div[1]/div[5]/div[2]/a
		//Only Relative Xpath should be used----//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input
				
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("HabeebSiriyala");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("habeebnsp");
	
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("Hab8459621@");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("Hab8459621@");
		
		//driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("habeebnsb@rediffmail.com");
		
		//driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("9985854585");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")).sendKeys("10");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")).sendKeys("JUN");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")).sendKeys("2000");
		
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]")).sendKeys("Male");
		
		//driver.findElement(By.xpath("//*[@id='country']")).sendKeys("China");
		
		//driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")).sendKeys("Hyderabad");
		
		//Select select = new Select(driver.findElement(By.id("country")));
		//select.selectByVisibleText("India");
		//Select select1 = new Select(driver.findElement(By.name("city48667607")));
		//select1.selectByVisibleText("Bangalore");
		
		
		
		
		
		//2.Id
		
		//driver.findElement(By.id("fullname")).sendKeys("HabeebSiriyala");
		//driver.findElement(By.id("password")).sendKeys("Hab8459621@");
		
		
		//3.Name
		
		//driver.findElement(By.name("fullname")).sendKeys("HabeebSiriyala");
		//driver.findElement(By.name("Email-ID")).sendKeys("HabeebS78");
		
		
		//4.LinkText----This is Only For Links
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		
		//5.PartialLinkText: ---Not Useful
		
		//driver.findElement(By.partialLinkText(" How to Pick")).click();
		
		
		//6.CSSSelector
		//if id is there ----- #{id}
		//if class is there ---- {class}
		
		//driver.findElement(By.cssSelector("#address1")).sendKeys("12 new Strt");
		
		//7.Class Name:-----Not Useful
		
		//driver.findElement(By.className("ancAsb")).click();
		
	    
		
		
		
	}

}

