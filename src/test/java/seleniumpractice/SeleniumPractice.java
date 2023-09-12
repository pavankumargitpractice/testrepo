package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPractice {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		
		//window maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		//driver.findElement(By.className("SDkEP")).sendKeys("Selenium");
		
		//Explicit wait
		//new WebDriverwait(Driver,10).until(ExpectedConditions.titleContains("");
		driver.findElement(By.name("btnK")).click();
		String Results = driver.findElement(By.id("result-stats")).getText();
		System.out.println(Results);
		if(Results.contains("About")) {
			System.out.println("Search result are found:"+ " "+ "Success");
			
		} else {
			System.out.println("Search result are NOT found:"+ " "+ "UN-Success");
		}
		//driver.quit();

	}

}
