package seleniumpractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickers {
	
	//https://www.youtube.com/watch?v=CZxZsTGnYFg&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=24
	
	static WebDriver driver;
	static String Year="2023";
	static String Month ="Dec";
	static String day="15";

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("onwardCal")).click();
		
		while(true) {	
		Thread.sleep(5000);
		String Month_year= driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//descendant::div[2]")).getText();
		System.out.println(Month_year);
		String[] arr= Month_year.split(" ");
		String Mon = arr[0];
		String Yr = arr[1];
		System.out.println("array 0 "+arr[0]);
		System.out.println("array 1 "+arr[1]);
		System.out.println("array 1 "+arr[2]);
		
		//if(Mon.equalsIgnoreCase(Month)&& Yr.equalsIgnoreCase(Year)) {
		if(Mon.equalsIgnoreCase(Month)&& Yr.contains(Year)) {
			break;
		}
		else {
			
			try {
				if(driver.switchTo().alert().equals(true)) {
					driver.switchTo().alert().accept();
				}
				driver.findElement(By.xpath("//*[@id='Layer_1'][1]")).click();
				Thread.sleep(5000);
			} catch(Exception StaleElementReferenceException) {
				
				
			}
			
			
		}
		}
		//Date Selection
	//	List<WebElement> Alldates= driver.findElements(By.xpath("//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']//div/span"));
		String Xpath1="//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']//div/span[contains(text(),"+day+")]";
		driver.findElement(By.xpath(Xpath1)).click();
		

		
		}

	}


