package seleniumpractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		 Alert alert1 = driver.switchTo().alert(); 
		 System.out.println(alert1.getText());
		 alert1.accept();
		 
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		driver.findElement(By.linkText("NetBanking")).click();			
		
		//Getting Main window handle
		 String MainWindowHandle= driver.getWindowHandle();
		 System.out.println("main Windo Handle is:"+ " "+MainWindowHandle); 
				
		 
		 //Getting ALL window handles
		Set<String> winColl =driver.getWindowHandles();
		
		//Iterating through all window handels
		Iterator<String> itr= winColl.iterator();
		while(itr.hasNext()) {
			String ChildWindowHandle= itr.next();	
			System.out.println(ChildWindowHandle);
			if(!MainWindowHandle.equalsIgnoreCase(ChildWindowHandle)) {
				driver.switchTo().window(ChildWindowHandle);
				driver.switchTo().frame("login_page"); 
				//Thread.sleep(5);
				driver.findElement(By.linkText("CONTINUE")).click();
				
				//Handling Alert window
				Alert alert=driver.switchTo().alert();				
				System.out.println(alert.getText());
				alert.accept();
			}
		}
		 // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindowHandle);	
	}

}
