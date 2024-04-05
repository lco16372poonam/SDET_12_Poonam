package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(3000);
		WebElement rbutton = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		 Actions act= new Actions(driver);
		 
		  act.contextClick(rbutton).build().perform();
		  
			driver.findElement(By.xpath("/html/body/div/section/div/div/div/pre[1]/code/span[14]"));

	

	}

}
