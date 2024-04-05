package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_AlertWithInbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();	
		
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("I am Pop up Window");
		
		alert.accept();
		
		//alert.dismiss();
		Thread.sleep(3000);

		String text = driver.findElement(By.id("result")).getText();
		  if(text.equals("You entered: I am Pop up Window"))
			 // if(text.equals("You entered: null"))
		  {
		 System.out.println("Test Passed");
		  }
		  
		 else
			 System.out.println("Test Failed");
	}

}
