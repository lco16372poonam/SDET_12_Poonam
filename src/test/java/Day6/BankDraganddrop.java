package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BankDraganddrop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		
		WebElement account1 = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']")); 
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		 
		Actions act = new Actions(driver);
		act.dragAndDrop(bank, account1).build().perform();
		Thread.sleep(3000);
		
		WebElement amount1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li")); 
		WebElement c1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		Thread.sleep(3000);
		act.dragAndDrop(c1, amount1).build().perform();
		
		WebElement account2 = driver.findElement(By.xpath("//*[@id=\"loan\"]")); 
		WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		Thread.sleep(3000);
		act.dragAndDrop(sales, account2).build().perform();
		
		Thread.sleep(3000);
		WebElement amount2 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li")); 
		WebElement c2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		act.dragAndDrop(c2, amount2).build().perform();
	
		String result = driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText(); 
		System.out.println(result);

		if(result.equals("Perfect!"))
		{
			System.out.println("Test is PASSED");
		}
		else 
		{
			System.out.println("Test is Failed");
		}
		
		driver.close();
		}
	}

