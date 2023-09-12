package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownPractice {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		
		//switching to frame
		driver.switchTo().frame("iframeResult");
		
		WebElement CarsElement = driver.findElement(By.id("cars"));
		
		//Actions class for using keyboard and mouse operations
		Actions actions = new Actions(driver);
		actions.sendKeys(CarsElement,Keys.CONTROL).build().perform();
		
		//Using Elements select class
		Select select = new Select(CarsElement);
		
		System.out.println("Clicking on the multipledropdown window");		
		select.selectByValue("opel");
		select.selectByValue("audi");
		select.selectByVisibleText("Volvo");
		List<WebElement> Selvals= select.getAllSelectedOptions();
		System.out.println(Selvals.size());
		for(WebElement carsel:Selvals) {
			System.out.println(carsel.getText());
			
		}
		List<WebElement> selectedoptions= select.getAllSelectedOptions();
		System.out.println("First selected option :" + select.getFirstSelectedOption());
		System.out.println("Mutiple select dropdown or not :" + select.isMultiple());
		//System.out.println(selectedoptions);
		for(WebElement e: selectedoptions) {
			System.out.println("All selected options from dropdown : "+ e.getText());
			
		}
		
		select.deselectAll();
		System.out.println("Size after deselecting All :" + Selvals.size());
		
		
		

	}

}
