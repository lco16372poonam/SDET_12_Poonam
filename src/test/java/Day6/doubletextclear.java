package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubletextclear {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
	WebElement f1 = driver.findElement(By.xpath("//*[@id=\"field1\"]"));
	f1.clear();
	
	 driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("New Value");
	 
	 WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	 
	 
	 Actions act= new Actions(driver);
	 
	  act.doubleClick(button).build().perform();
	  
	  WebElement f2 = driver.findElement(By.xpath("//input[@id='field2']"));

	  String text = f2.getAttribute("value");
	  System.out.println(text);
	  
	  if(text.equals("Welcome"))
	  {
		  System.out.println("Test passed");
	  }
	  
	  else
	  {
		  System.out.println("Test Failed");

	  }
		 
	}

}
