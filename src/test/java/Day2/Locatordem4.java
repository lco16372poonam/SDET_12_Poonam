package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordem4 {

	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// absolute Xpath
		
		//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")).click();
		
		//String text = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")).getText();

		//System.out.println(text);
		
		//Relative xpath
		
		//String text = driver.findElement(By.xpath("//a[normalize-space()='Apple MacBook Pro 13-inch']")).getText();
		//String text = driver.findElement(By.xpath("//*[text()='Apple MacBook Pro 13-inch']")).getText();

		String text = driver.findElement(By.xpath("//a[normalize-space()='Build your own computer']")).getText();

		System.out.println(text);
		
		//driver.close();
		
	}
}
