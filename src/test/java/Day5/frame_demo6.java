package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_demo6 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame1

		WebElement fram1 = driver.findElement(By.xpath("html/frameset/frame[1]"));
		driver.switchTo().frame(fram1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("First text box");
		
		driver.switchTo().defaultContent(); //driver to default location of page
		
		//Frame 2nd
		 
		WebElement fram2 = driver.findElement(By.xpath("/html/frameset/frameset/frame"));
		driver.switchTo().frame(fram2);
		driver.findElement(By.name("mytext2")).sendKeys("2nd textbox of the webpage");

		//Frame 3
		driver.switchTo().defaultContent();	 
		WebElement fram3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(fram3); //Web element
		driver.findElement(By.name("mytext3")).sendKeys("Third text box");
		
		driver.switchTo().frame(0); //index
		//iframe inside frame:  
		driver.findElement(By.xpath("//*[@id='i8']/div[3]/div")).click(); //I am a human
		
		
		//Frame 4th
			driver.switchTo().defaultContent();	 
				WebElement fram4 = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
				driver.switchTo().frame(fram4);
				driver.findElement(By.name("mytext4")).sendKeys("4th textbox of the webpage");
		
		//Frame 5	
		driver.switchTo().defaultContent();	 
		WebElement fram5 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(fram5);
		Thread.sleep(3000);
		driver.findElement(By.name("mytext5")).sendKeys("This is textbox of frame 5");		
	}
}
