package seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");		
				driver.manage().window().maximize();
				
				//To take screenshot of full page
				/*
				 * driver.get("https://www.letskodeit.com/practice");
				 * driver.manage().window().maximize(); TakesScreenshot scrShot=
				 * ((TakesScreenshot)driver); 
				 * File scrFile= scrShot.getScreenshotAs(OutputType.FILE); 
				 * Files.copy(scrFile, new File("C:\\Users\\npava\\OneDrive\\Desktop\\Seleniumscreenshots\\amazon.jpeg")
				 * );
				 */
				
				
				//To take screenshot of an Element in a page
				
				WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
				File f= logo.getScreenshotAs(OutputType.FILE);
				//Files.copy(f, new File("C:\\Users\\npava\\OneDrive\\Desktop\\Seleniumscreenshots\\QAElement.jpeg"));
				FileUtils.copyFile(f, new File("C:\\Users\\npava\\OneDrive\\Desktop\\Seleniumscreenshots\\QAElement123.jpeg"));
	}

}
