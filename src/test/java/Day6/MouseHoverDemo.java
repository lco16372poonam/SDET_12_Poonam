package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(3000);
		/*WebElement Desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));*/
		
		
		WebElement lap = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		WebElement wins = driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);

		//act.moveToElement(Desktop).moveToElement(Mac).click().build().perform();
		
		act.moveToElement(lap).moveToElement(wins).click().build().perform();

		Thread.sleep(3000);

	}

}
