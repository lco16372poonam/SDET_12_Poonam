package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();		
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			driver.get("https://jqueryui.com/datepicker/");
			Thread.sleep(3000);
			
			//Approach 1
			driver.switchTo().frame(0);
			//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/15/2024");
			
			//Approach 2
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			
			String year = "2026";
			String month = "May";
			String  date ="20";
			
			while(true)
			{
				String yr = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
				String mon = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
				
				if(year.equals(yr) && month.equals(mon))
				{
					break;
				}
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

			}
			
			//date
			
			//*[@class="ui-datepicker-calendar"]//td
			
			List <WebElement> alldates = driver.findElements(By.xpath("	//*[@class=\"ui-datepicker-calendar\"]//td\r\n"	+ ""));
			
			for(WebElement dates:alldates)
			{
				if(dates.getText().equals(date))
				{
					dates.click();
					break;
				}
			}
			
			for(int i =0; i<alldates.size(); i++)
			{
				if(alldates.get(i).getText().equals(date))
				{
					alldates.get(i).click();
					break;
				}
			}
}
}
