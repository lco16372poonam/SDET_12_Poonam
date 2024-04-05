package Day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlesdemo {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set <String> windowids = driver.getWindowHandles();
		
		//Approach 1 convert set into list or array list
		
		List <String> al = new ArrayList(windowids);
		
		 String parentwindowid = al.get(0);
		 String childwindowid = al.get(1);
		 
		  driver.switchTo().window(childwindowid);
		  
		  driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		 System.out.println(driver.getTitle());
		 
		  driver.switchTo().window(parentwindowid); //section[@aria-label='OHRM Active Users Section']
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 
		 //Approach 2
		
		/*	Set <String> windowids = driver.getWindowHandles();
			
			for(String winid:windowids)
			{
				String title = driver.switchTo().window(winid).getTitle();
						
				if(title.equals("Human Resources Management Software | OrangeHRM"))
				{
					Thread.sleep(3000);
					driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
					
					System.out.println(driver.getTitle());//OrangeHRM

				}
				 
				else if(title.equals("OrangeHRM"))
				{
					driver.findElement(By.name("username")).sendKeys("Adminnn");
					System.out.println(driver.getTitle()); //Book Your Free Demo | OrangeHRM and OrangeHRM
				}} */
			
			
		/*	for(String winid: windowids)
			{
				String title = driver.switchTo().window(winid).getTitle();
				
			 if (title.equals("Human Resources Management Software | OrangeHRM)"))
					 {
				 driver.close();
					 }
			 
			 else
			 {
				 driver.findElement(By.name("username")).sendKeys("12344");
				 System.out.println(driver.getTitle());
			 }
	}*/
			
	}
}
