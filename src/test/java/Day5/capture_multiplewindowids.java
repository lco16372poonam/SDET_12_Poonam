package Day5;

//Homework assignment (https://testautomationpractice.blogspot.com/) Automation Testing Practice

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class capture_multiplewindowids {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
		
		//Capture the window id of all web pages and print their title
		
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();	
		driver.findElement(By.xpath("//a[normalize-space()='More »']")).click();
		
		Set <String> windowids = driver.getWindowHandles();
		
		for(String winid:windowids)
		{
			String title = driver.switchTo().window(winid).getTitle();
					
			if(title.equals("Selenium - Wikipedia")|| title.equals("Selenium (software) - Wikipedia"))
			{
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class=\"mw-page-title-main\"]")).click();
				
				System.out.println(driver.getTitle());

			}
			
			else if(title.equals("Automation Testing Practice") || title.equals("Selenium in biology - Wikipedia") || title.equals("Selenium disulfide - Wikipedia") || title.equals("Selenium dioxide - Wikipedia") || title.equals("selenium - Search results - Wikipedia"))
			{
				Thread.sleep(3000);
				//driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
				System.out.println(driver.getTitle()); 
			}
		}
	
	}

}
