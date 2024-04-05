package Day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\\\"Wikipedia1_wikipedia-search-input\\\"]")).click();

	//	driver.switchTo();
		}}
