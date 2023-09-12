package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearchGooglePreferenceDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		//driver.findElement(By.xpath("")).click();
		WebElement searchdrpdwn = driver.findElement(By.id("autocomplete"));
		searchdrpdwn.clear();
		searchdrpdwn.sendKeys("Toronto");
		String text;
		do {
			searchdrpdwn.sendKeys(Keys.ARROW_DOWN);
			 text= searchdrpdwn.getAttribute("value");
			if(text.equals("Toronto, OH, USA")) {
				searchdrpdwn.sendKeys(Keys.ENTER);
				break;
				
			}
		} while(!text.isEmpty());
		


	}

}
