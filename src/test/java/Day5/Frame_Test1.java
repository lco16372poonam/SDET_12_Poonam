package Day5;

// Embedded frame in selenium java

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Test1 {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Accessing Frame1 and entering data into the text box
		WebElement fram1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));	
		driver.switchTo().frame(fram1);
		driver.findElement(By.name("mytext1")).sendKeys("Editorial");
		
		driver.switchTo().defaultContent(); 
		WebElement fram2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(fram2);
		driver.findElement(By.name("mytext3")).sendKeys("CURRENT");
		
		driver.switchTo().defaultContent();
		WebElement fram5 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(fram5);
		driver.findElement(By.xpath("//input[@name=\"mytext5\"]")).sendKeys("Completed task");
		
	}
}
