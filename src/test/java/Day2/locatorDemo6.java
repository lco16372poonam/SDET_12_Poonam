package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//WAP to count the following elements available in facebook login page.

public class locatorDemo6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//input[@name="email" and  @placeholder="Email address or phone number" ]/following::*
			
		List <WebElement> addr = driver.findElements(By.xpath("//*[@name=\"email\"]/following::*"));
		System.out.println(addr.size());
		
		//get the number of textbox in the page of facebook
		
	}
}
