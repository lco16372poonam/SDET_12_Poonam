package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboarddemo1 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("blue chips");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);

		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);

		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		
	}

}
