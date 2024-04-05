package Day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.automationpractice.pl/index.php");
		 
		 List <WebElement > slider = driver.findElements(By.className("homeslider-container"));
		 
		 System.out.println("The slider contains total images :: " +slider.size());
		 
		 List <WebElement > image = driver.findElements(By.tagName("img"));
		 
		 System.out.println("The total number of images  avialabe on the page is :: " +image.size());
		
		 List <WebElement > links = driver.findElements(By.tagName("a"));
		 
		 System.out.println("The total number of links  avialabe on the page is :: " +links.size());		 
		 
	}

}
