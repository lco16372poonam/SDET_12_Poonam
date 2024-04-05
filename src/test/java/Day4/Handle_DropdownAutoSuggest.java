package Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_DropdownAutoSuggest {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");	
		Thread.sleep(4000);

		
		List <WebElement> list =	driver.findElements(By.xpath("//*[@class=\"wM6W7d\"]"));
		
		Thread.sleep(4000);

		System.out.println("The total number of elements in dropdown are:" +list.size());
		
		for (int i = 0; i< list.size(); i++)
		{
			
				System.out.println(list.get(i).getText());
				Thread.sleep(4000);
			
		}
		
		//Select the selenum tutorial from auto list of the google.
		for (int i = 0; i< list.size(); i++)

		{
			if(list.get(i).getText().equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}			
		}

	}
}
