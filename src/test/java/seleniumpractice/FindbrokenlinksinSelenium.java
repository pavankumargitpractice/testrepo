package seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindbrokenlinksinSelenium {
	static WebDriver driver;
	//code- > https://www.guru99.com/find-broken-links-selenium-webdriver.html

	public static void main(String[] args) throws MalformedURLException, IOException   {
		HttpURLConnection huc = null;
		int respCode = 200;
		String url="";
		String homePage = "http://www.zlti.com";
				
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(homePage);
		
		driver.manage().window().maximize();
		//Thread.sleep(10);
		List<WebElement> LinksColl = driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr= LinksColl.iterator();
		while(itr.hasNext()) {
			 url= itr.next().getAttribute("href");
			if(url== null||url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				  continue;
				
			}
			
		

            //Now we will be creating url connection and getting the response code
			 
				huc = (HttpURLConnection)(new URL(url).openConnection());	
            
				huc.setRequestMethod("HEAD");			
				huc.setConnectTimeout(5000);
				huc.connect();			
            
				respCode = huc.getResponseCode();			
            if(respCode>=400) {
            	System.out.println(url+" is a broken link");
            	
            } else{
                System.out.println(url+" is a valid link");
            }
            
			
		}

	}

}
