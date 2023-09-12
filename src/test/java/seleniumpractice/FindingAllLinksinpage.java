package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingAllLinksinpage {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		boolean flag= false;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List<WebElement> linksColl = driver.findElements(By.tagName("a"));
		System.out.println(linksColl.size());
		for(WebElement e:linksColl) {
			String LinkValue = e.getText();
			System.out.println(LinkValue);
			if(LinkValue.equals("తెలుగు")){				
				flag=true;
				if(flag==true) {
					e.click();
					break;
					
				}
				
			}

			
		}
		

	}

}
