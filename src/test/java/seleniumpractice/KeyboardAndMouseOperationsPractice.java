package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseOperationsPractice {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement FromCity = driver.findElement(By.id("fromCity"));
		WebElement ToCity = driver.findElement(By.id("toCity"));
		//a[@class="close"]
		//WebElement window = driver.findElement(By.xpath("//a[@class=\"close\"]"));
		
		//Selecting From City
		/*
		 * FromCity.click(); FromCity.sendKeys("Del");
		 * FromCity.sendKeys(Keys.ARROW_DOWN); FromCity.sendKeys(Keys.TAB);
		 * 
		 * //Selecting To city ToCity.sendKeys("pu"); ToCity.sendKeys(Keys.ARROW_DOWN);
		 * ToCity.sendKeys(Keys.ARROW_DOWN); ToCity.sendKeys(Keys.ENTER);
		 */
		Thread.sleep(20);
		Actions actions = new Actions(driver);
		actions.keyDown(FromCity,Keys.SHIFT).sendKeys("h").keyUp(FromCity,Keys.SHIFT).sendKeys("hy").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).build().perform();
		actions.keyDown(FromCity,Keys.SHIFT).sendKeys("h").keyUp(FromCity, Keys.SHIFT).sendKeys("yd").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys(ToCity, "ban").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		actions.sendKeys(ToCity, "ban").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		

	}

}
