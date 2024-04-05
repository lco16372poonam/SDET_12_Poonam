package Day3;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait {

	public static void main(String[] args) {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		FluentWait mywait = new FluentWait();
		 mywait.withTimeout(Duration.ofSeconds(30));
		 mywait.pollingEvery(Duration.ofSeconds(5));
		 mywait.ignoring(NoSuchElementException.class);
		 
		 
		 mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
