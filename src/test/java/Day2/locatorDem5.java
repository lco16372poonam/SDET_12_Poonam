package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class locatorDem5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationbookstore.dev/\r\n");
		
		Thread.sleep(4000);
		
		WebElement book = driver.findElement(By.id("pid6"));  
		
		String book1 = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(book)).getText();
				
		System.out.println(book1);
		
	}
	
}
