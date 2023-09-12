package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilies.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	
	/*
	 * public String baseURL ="https://demo.guru99.com/test/login.html"; public
	 * String username ="mngr515126"; 
	 * public String password = "egajYhe"; 
	 */
	
	public String baseURL = readConfig.getApplicationURL();
	public String username =readConfig.getUsername();
	public String password = readConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger = Logger.getLogger("Ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("Chrome")) {		
		
		System.setProperty("webDriver.chrome.driver", readConfig.getChromePath());
		driver= new ChromeDriver();
		//System.setProperty("webDriver.chrome.driver", "C://Users//npava//eclipse-workspace//InetBanking//Drivers//chromedriver.exe");
//		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");

		} else if(br.equals("firefox")) {
			System.setProperty("webDriver.gecko.driver", readConfig.getFirefoxPath());
			driver = new FirefoxDriver();
			
		} else if(br.equals("ie")) {
			System.setProperty("webDriver.ie.driver", readConfig.getIEPath());
			driver = new InternetExplorerDriver();
			
		}
		 driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

	
}
