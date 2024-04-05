package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		//min slider element
		
		/*WebElement e1 = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		
		System.out.println(e1.getLocation());
		  
		Actions act = new Actions(driver);
		 act.dragAndDropBy(e1, 100, 0).perform();*/
		 
			//max slider element

		 WebElement e2 = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
			
			System.out.println(e2.getLocation());
			  
			Actions act = new Actions(driver);
			 act.dragAndDropBy(e2, -100, 0).perform();
	}

}
