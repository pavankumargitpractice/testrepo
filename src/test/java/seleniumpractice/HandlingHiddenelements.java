package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenelements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");		
				driver.manage().window().maximize();
				JavascriptExecutor js= (JavascriptExecutor)driver;
				driver.findElement(By.id("hide-textbox")).click();
				
				//Thread.sleep(8000);
				js.executeScript("document.getElementById('displayed-text').value='pavan';");
				
				

	}

}
