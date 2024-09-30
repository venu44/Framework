package Tdd.Framework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Login extends  dataProviderCode {
		
		public static RemoteWebDriver driver;
		

	    public Login(String filePath) throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	   
	    @SuppressWarnings("deprecation")
		@Test(dataProvider = "testData", dataProviderClass = dataProviderCode.class)
	    public void myTestMethod(String value1, String value2) throws MalformedURLException {
	      System.out.println("Value 1: " + value1);
	      System.out.println("Value 2: " + value2);
	
	      
	      //maximun automation channel , selenium grid changes below
	      
	      ChromeOptions options= new ChromeOptions();
	     // driver= new RemoteWebDriver(new URL ("http://192.168.29.139:4444"), options);
	     // options = DesiredCapabilities.chrome();
	   //   options.setBrowserVersion("55.0.2");
	     
	   //   options.setPlatformName(org.openqa.selenium.Platform.WINDOWS);
	      
	     // driver= new RemoteWebDriver(new URL ("http://192.168.29.139:5555"), options);
	        
	        // Set up the WebDriverManager to automatically download and setup the ChromeDriver executable
	      WebDriverManager.chromedriver().setup();
	        
	        // Set up the ChromeOptions with desired capabilities, such as running in headless mode
	       /* ChromeOptions options = new ChromeOptions();
	        options.setHeadless(true);*/
	        
	        // Create a new instance of the ChromeDriver with the desired capabilities
	       driver = new ChromeDriver();
			/*
			 * baseExcel reader = new baseExcel(
			 * "C:\\Users\\ASUS\\Desktop\\Suresh_Automation\\Framework\\Resources\\TestData.xlsx"
			 * ); String cellValue = reader.getCellValue(0, 0); // get value of cell A1
			 * String password=reader.getCellValue(1, 1); String
			 * username=reader.getCellValue(1, 0);
			 * 
			 * System.out.println(username); System.out.println(password);
			 */
	        
	   
	        
	        // Launch the Chrome browser and navigate to the Google homepage
	       driver.get("https://practicetestautomation.com/practice-test-login/");
	        driver.findElement(By.id("username")).sendKeys(value1);
	        driver.findElement(By.id("password")).sendKeys(value2);
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
	        driver.findElement(By.id("submit")).click();
	        
	        
	       
	       // reader.close();
	        // Close the browser
	        driver.quit();
	    }
		
	}

