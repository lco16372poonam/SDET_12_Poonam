package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDemo2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
	
		driver.findElement(By.xpath("//*[@id=\"target\"]")).click();
		
		Actions act = new Actions(driver);		
		act.sendKeys("Russ").perform();
		
	String result = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	
	System.out.println(result);

	if(result.equals("You entered: S"))
	{
		System.out.println("Test is PASSED");

	}
	
	else {
		System.out.println("Test is Failed");
	}
	}

}
