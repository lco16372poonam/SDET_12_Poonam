package Day4;

//Program to print the selected values of drop down list

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Navigate to a webpage containing a dropdown element.
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	
		// Locate the dropdown element using appropriate locators. 
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		Select drp = new Select(dd);
		
		//Select an option from the dropdown by its visible text.
		drp.selectByVisibleText("India");	

		Thread.sleep(3000);		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
		Select drp1 = new Select(state);
		drp1.selectByVisibleText("Haryana");
		
		//Print the selected option to the console.		
		Select country = new Select(driver.findElement(By.xpath("//*[@id=\"country-list\"]")));
		String selectedCountry = country.getFirstSelectedOption().getText();
		System.out.println("The value selected in the drop down list is :: " +selectedCountry);
		
		 Select city = new Select(driver.findElement(By.xpath("//*[@id=\"state-list\"]")));
		 String selectedcity = city.getFirstSelectedOption().getText();
		 System.out.println("The value selected in the drop down list is :: " +selectedcity );		
	}
}
