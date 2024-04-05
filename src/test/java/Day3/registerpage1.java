package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerpage1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		
		 driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Bhavya");
		 driver.findElement(By.cssSelector("input#LastName")).sendKeys("Sharma");
		 driver.findElement(By.cssSelector("input#Email")).sendKeys("Bhavyasharama@gmail.com");
		 driver.findElement(By.cssSelector("input#Company")).sendKeys("Bluefins");
		 driver.findElement(By.cssSelector("input#Password")).sendKeys("ronaldo47bc");
		 driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("ronaldo47bc");
		 
	//	 driver.findElement(By.name("register-button")).click();

	}

}
