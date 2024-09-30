package Tdd.Framework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

	public class TestLoginGrid3 extends  dataProviderCode {
		
		WebDriver driver;
	

	    public TestLoginGrid3(String filePath) throws IOException {
			super();
			// TODO Auto-generated constructor stub
				           
		}
	    	
	
    @Test(priority=1)
    void title1() throws MalformedURLException {
    	
    	 DesiredCapabilities capabilities = new DesiredCapabilities();
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--remote-allow-origins=*");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	        capabilities.setCapability("platformName", "WINDOWS");
	        capabilities.setCapability("browserName", "chrome");

	        // Set the Selenium Grid URL
	        ChromeOptions options =new ChromeOptions();
	        
	        String gridUrl = "http://localhost:4444";
    	
	        driver = new RemoteWebDriver(new URL(gridUrl), options);

	        
    	 driver.get("https://practicetestautomation.com/practice-test-login/");
    	String title= driver.getTitle();
    	System.out.println("1st title is  : " + title);
    	driver.close();
    }
    @Test(priority=3)
    void title2() throws MalformedURLException {
    	
    	 DesiredCapabilities capabilities = new DesiredCapabilities();
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--remote-allow-origins=*");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	        capabilities.setCapability("platformName", "WINDOWS");
	        capabilities.setCapability("browserName", "chrome");

	        // Set the Selenium Grid URL
	        ChromeOptions options =new ChromeOptions();
	        
	        String gridUrl = "http://localhost:4444";
	        driver = new RemoteWebDriver(new URL(gridUrl), options);

	        
    	
    	 driver.get("https://practicetestautomation.com/practice-test-login/");
    	String title= driver.getTitle();
    	System.out.println("2nd title is  : " + title);
    	driver.close();
    }
	/*
	 * @Test(priority=3) void title3() {
	 * 
	 * driver.get("https://www.google.com/"); String title= driver.getTitle();
	 * System.out.println("3rd title is  : " + title); driver.quit(); }
	 */
    
    
    
	}