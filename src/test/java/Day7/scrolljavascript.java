package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolljavascript {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		//driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		driver.get("https://www.orangehrm.com/");
	
		JavascriptExecutor js = driver;
		
		//scroll page by pixel
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll down to Specific element
		
		/*WebElement  India =driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();", India);
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
 
		//Scroll down till the end of the document
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", "")); //6.400000095367432
		
		//Scroll back to initial position
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", "")); //6345.60009765625
		
		driver.close();
		
	}
}
