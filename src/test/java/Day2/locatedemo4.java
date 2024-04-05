package Day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatedemo4 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		 
		 //Tag and Id
		
		/*driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Passingdata");*/


		//Tag and class
		 
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Top company");

		
		 //Tag and attribute
		
		// driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("brandname");

		 
		 //Tag, class and attribute
		driver.findElement(By.cssSelector("input.search-box-text[aria-label=\"Search store\"]")).sendKeys("Bluenile");
	 
		driver.close();		
	}
}
