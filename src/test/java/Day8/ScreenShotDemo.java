package Day8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		//ChromeDriver driver = new  ChromeDriver();
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		
			Thread.sleep(3000);
	TakesScreenshot ts =  (TakesScreenshot) driver;
	
	//File src = ts.getScreenshotAs(OutputType.FILE);
	//File trg = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_Maven_B12\\Screenshot\\fullpage.png");
//	FileUtils.copyFile(src, trg);
		

			//take screenshot for a specific point of the webpage
			/*WebElement featureProduct = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
	File src1 = featureProduct.getScreenshotAs(OutputType.FILE);
	File trg1 = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_Maven_B12\\Screenshot\\featureProduct.png");
	FileUtils.copyFile(src1, trg1); 
	System.out.print("Screenshot taken");*/
	
	//logo screenshot
	WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]"));
	File src = logo.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_Maven_B12\\Screenshot\\logo.png");
	FileUtils.copyFile(src, trg);
	System.out.print("Screenshot taken");
	
	}
}
