package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapPractice {
	
	
	//https://www.youtube.com/watch?v=gplxQ3mtmGY&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=10
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[text()=\"Select Product Type\"]")).click();		
	
		List<WebElement> DropDwnColl = driver.findElements(By.xpath("//div[@class=\"drp1\"]//ul/li"));
		
		SelectOptionFromDrpdwn(DropDwnColl,"Accounts");
		/*
		 * for(WebElement dp:DropDwnColl) { String DropdownVal = dp.getText();
		 * if(DropdownVal.equals("Accounts")) { dp.click(); break;
		 * 
		 * }
		 * 
		 * }
		 */
		
		driver.findElement(By.linkText("Select Product")).click();
		List<WebElement> SelectProdColl = driver.findElements(By.xpath("//ul[contains(@class,\"dropdown2\")]//li"));
		SelectOptionFromDrpdwn(SelectProdColl,"Salary Accounts");

		
	}
	
	public static void SelectOptionFromDrpdwn(List<WebElement> optionsColl, String value) { 

	for(WebElement product:optionsColl) {
		String productDropdownVal = product.getText();		
	if(productDropdownVal.equals(value)) {
		product.click();
		break;
		
	}
}
}

}