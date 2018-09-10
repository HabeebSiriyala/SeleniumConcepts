package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customxpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launch FireFox Browser	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/");
        /* 
		Absolute Xpath: is not recommended
		--html/body/table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/a
	    disadvantages of Absolute Xpath
		--1.performance Issue
		--2.not reliable
		--3.can be changed at any time in future
		*/
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("drop");
		driver.findElement(By.xpath("//button[@class='icon-search']")).click();
		driver.findElement(By.xpath("//button[@class='icon-search']")).click();
		
		//dynamic id: input
		//id-test_123
		By.id("tewst_123");
		
		//starts_with
		//id = test_1234
		//id = test_3456
		//id = test_test_390
		
		//ends_with
		//id = 897_test-t
		//id = 278_test_t\
		
		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Reas");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Reas");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Reas");
		
		//for links -------- Use Custom Path
		// all the links are represented by <a> html tag
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();

	}
}
