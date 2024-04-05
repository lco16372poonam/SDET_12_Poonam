package Day14;

//Develop a Java code snippet to switch to a new window or tab that was opened as a result of clicking a link.

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingSele {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		driver.get("https://demo.opencart.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[7]/a")).click();
		Set <String> windowids = driver.getWindowHandles();

		List <String> al = new ArrayList(windowids);

		for(String winid:windowids)
		{
			String title = driver.switchTo().window(winid).getTitle();
					
			if(title.equals("Cameras"))
			{
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@class='price-old']")).click();
				
				System.out.println(driver.getTitle());//OrangeHRM

			}
			 
			else if(title.equals("Your Store"))
			{
				driver.findElement(By.name("search")).sendKeys("camera");
				System.out.println(driver.getTitle()); //Book Your Free Demo | OrangeHRM and OrangeHRM
			}}

		
	}
}
