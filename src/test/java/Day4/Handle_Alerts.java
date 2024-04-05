package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();	
		
	//	driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		Thread.sleep(3000);
		
		 String text = driver.findElement(By.id("result")).getText();
		  if(text.equals("You clicked: Ok"))
			  //if(text.equals("You successfully clicked an alert"))
 
		 System.out.println("Test Passed");
		  
		 else
			 System.out.println("Test Failed");
			 	
	}

}
