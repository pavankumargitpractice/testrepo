package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadfileInSeleniumWebDrive {
	
	static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.foundit.in");
		driver.manage().window().maximize();
		
		//using sendKeys() -- if HTML of this element has type='file' tag then we can use sendkeys() method
		/*
		 * driver.findElement(By.
		 * xpath("//div[@class=\"heroSection-buttonContainer_secondaryBtn secondaryBtn\"]"
		 * )).click();
		 * driver.findElement(By.id("file-upload")).sendKeys("C:\\pavan\\doc1.docx");
		 */
		
		
		//Using Robot class
		
		Robot rb= new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\pavan\\doc1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
