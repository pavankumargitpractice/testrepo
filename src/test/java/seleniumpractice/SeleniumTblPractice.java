package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTblPractice {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> Rowcoll = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
		System.out.println("Rows Count :"+Rowcoll.size());
		
		for(int row=1;row<Rowcoll.size();row++) {
			List<WebElement> Colcoll = Rowcoll.get(row).findElements(By.xpath("//td"));
			System.out.println("Coulm count : "+Colcoll.size());
			for(int col=0;col<Colcoll.size();col++) {
				String CellValue= Colcoll.get(col).getText();
				System.out.println(CellValue);
				
			}
			System.out.println();
			
		}
		

	}

}
