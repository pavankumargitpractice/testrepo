package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpractice {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		boolean Enabledflag,Disabledflag,Selectedflag;
		
		//Dropdown using Send Keys
		//driver.findElement(By.xpath("//select[@name=\"fromPort\"]")).sendKeys("Frankfurt");
		
		//Iterating through for loop using xpath
		/*
		 * List<WebElement> fromColl =
		 * driver.findElements(By.xpath("//select[@name=\"fromPort\"]/option"));
		 * System.out.println(fromColl.size()); for(WebElement city:fromColl) { String
		 * CityName= city.getText(); if(CityName.equals("Frankfurt")) {
		 * System.out.println("City Found"); city.click(); break;
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		
		//Using dropdown Select class
		
		/*
		 * WebElement FromElement= driver.findElement(By.xpath("//select[@name=\"fromPort\"]")); 
		 * Select select= new Select(FromElement); List<WebElement> citycoll= select.getOptions();
		 * 
		 * 
		 * for(WebElement City:citycoll) { System.out.println(City.getText());
		 * if(City.getText().equals("Paris")) { City.click(); break; }
		 * 
		 * 
		 * }
		 */
		
		Enabledflag = driver.findElement(By.xpath("//select[@name=\"fromPort\"]")).isEnabled();
		System.out.println("Enabled :"+Enabledflag);
		
		Disabledflag = driver.findElement(By.xpath("//select[@name=\"fromPort\"]")).isDisplayed();
		System.out.println("Displayed :"+Disabledflag);
		
		Selectedflag = driver.findElement(By.xpath("//select[@name=\"fromPort\"]")).isSelected();
		System.out.println("Selected :"+Selectedflag);
		
		WebElement FromElement= driver.findElement(By.xpath("//select[@name=\"fromPort\"]")); 
		 Select select= new Select(FromElement);
		 select.selectByIndex(2);
		 //select.selectByValue("Paris");
		System.out.println("is multiple or not : "+ select.isMultiple());
		System.out.println(" getFirstSelectedOption is : "+ select.getFirstSelectedOption());
		
		
		
	}

}
