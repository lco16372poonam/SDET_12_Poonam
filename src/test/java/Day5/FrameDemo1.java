package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo1 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frame");
		
		driver.switchTo().frame("frm1");
		 
		WebElement drp = driver.findElement(By.xpath("//select[@id='course']"));
		
		Select drpdwn = new Select(drp);
		drpdwn.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bye");
		//driver.findElement(By.xpath("//input[@id='name']"))

	}

}
