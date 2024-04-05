package Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_dropdown1 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.name("q")).sendKeys("Java");	
		Thread.sleep(3000);

		List <WebElement> list =	driver.findElements(By.xpath("//*[@class=\"sa_tm\"]"));
		
		Thread.sleep(3000);

		System.out.println("The total number of elements in dropdown are:" +list.size());
		
		for (int i = 0; i< list.size(); i++)
		{
			
				System.out.println(list.get(i).getText());
				Thread.sleep(3000);
			
		}
	}

}
