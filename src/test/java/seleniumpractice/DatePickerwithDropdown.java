package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerwithDropdown {
	
	//https://www.youtube.com/watch?v=CZxZsTGnYFg&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=24

	static WebDriver driver;
	static String date= "15";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application");
		driver.manage().window().maximize();
		driver.findElement(By.id("dob")).click();
		
		//Selecting the month from dropdown
		WebElement MonthDrpdwn= driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]/select[@class=\"ui-datepicker-month\"]"));
		Select Monthselect = new Select(MonthDrpdwn);
		Monthselect.selectByVisibleText("Sep");
		
		
		//Selecting the day from dropdown
		WebElement YearDrpdwn = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]/select[@class=\"ui-datepicker-year\"]"));
		Select Yearselect= new Select(YearDrpdwn);
		Yearselect.selectByVisibleText("2023");
		
		
		List<WebElement> Datecoll = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td"));
		for(WebElement day:Datecoll) {
			String dt=day.getText();
			if(date.equals(dt)) {
				day.click();
				break;
			}
		}
		

	}

}
