package Day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/*ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver =new ChromeDriver(option); *///open the browser
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless=new");
		ChromeDriver driver =new ChromeDriver(option); //open the browser
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
