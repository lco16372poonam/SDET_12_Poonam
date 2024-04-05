package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		
		 WebElement capital = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		 
		 Actions act = new Actions(driver);
		  act.dragAndDrop(capital, country).build().perform();
		  Thread.sleep(3000);
	}}
