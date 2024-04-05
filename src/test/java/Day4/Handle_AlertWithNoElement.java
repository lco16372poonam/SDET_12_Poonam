package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_AlertWithNoElement {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);

		String message = driver.findElement(By.cssSelector("div[class=\"example\"]p")).getText();
		
		if(message.contains("Congratulations"))
		 {
			 System.out.println("Test Passed");
		 }
			
		else
		{
			System.out.println("Test Failed");	
		}

	}

}
