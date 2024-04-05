package Day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.automationpractice.pl/index.php");
				 
		 //Tag and Id
		
		 //driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Tops");

		//Tag and class
		 
		// driver.findElement(By.cssSelector("input.search_query")).sendKeys("Tops");
		 
		
		 //Tag and attribute
		 
		 //driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Tops");
		
		 
		 //Tag, class and attribute
		 
		 driver.findElement(By.cssSelector("input.search_query[name=\"search_query\"]")).sendKeys("T-shirt");
		 
		driver.close();
		
		
	}
}
