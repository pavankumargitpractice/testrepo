package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPageusingSeleniumWebDriver {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		Thread.sleep(10);
		
		//To scroll down the web page by pixel.
		/*
		 * Thread.sleep(10); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,950)", "");
		 */
		
		//To scroll down the web page by the visibility of the element.
		
		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; WebElement Element =
		 * driver.findElement(By.linkText("Linux"));
		 * js.executeScript("arguments[0].scrollIntoView();", Element); Element.click();
		 */
		
		//scroll down to the bottom of the webpage 
		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 */
		
		
		//Horizontal scroll on the web page.
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		 WebElement Element = driver.findElement(By.linkText("VBScript"));
		 Thread.sleep(10);
		 js.executeScript("arguments[0].scrollIntoview();", Element);
		 //js.executeScript("arguments[0].scrollIntoView();", Element);
	}

}
