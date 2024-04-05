package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethod {

	public static void main(String[] args) {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement textboxx = driver.findElement(By.cssSelector("#LastName"));
		
		System.out.println("The last name textbox is  is visible ::" +textboxx.isDisplayed());
		System.out.println("The last name textbox is  is enabled ::" +textboxx.isDisplayed());
		
		System.out.println("The last name textbox is  is enabled ::" +textboxx.isDisplayed());


	}

}
