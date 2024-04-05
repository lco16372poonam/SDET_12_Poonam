package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
public class Get {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
				driver.manage().window().maximize();			
						
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
						
						driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
					
						WebElement dd = driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
						Select drp = new Select(dd);
			
						
						drp.selectByVisibleText("India");
						
						Thread.sleep(3000);
						
						WebElement state = driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
						Select drp1 = new Select(state);
						
						drp1.selectByVisibleText("Delhi");
	

	}}
