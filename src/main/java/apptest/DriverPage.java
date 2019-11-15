package apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverPage {

	 public static  WebDriver driver;

	    @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	    
	    @AfterClass
	    public static void closeBrowser(){
	    	driver.quit();
	    }

	   @Test
	    public void test() throws InterruptedException {
	        // Your test code here
		   	ChromeOptions options = new ChromeOptions();
		    options.setExperimentalOption("useAutomationExtension", false);
		    driver = new ChromeDriver(options);
	    	driver.get("https://google.com");
	    	System.out.println(driver.getTitle());
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).click();
	    	System.out.println(driver.getTitle());
	    }
}
