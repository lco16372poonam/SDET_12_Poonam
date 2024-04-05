package Day11;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelTesting {
	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://blazedemo.com/");
			
		WebElement dep = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select drp = new Select(dep);		
		drp.selectByVisibleText("Boston");
		
		WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select drp1 = new Select(destination);		
		drp1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();	
		
		//locate the elements of the columns
		//  Store them/price in an array or in a string  
		// sort the element and then find the lowest price 
		//Select the lowest one from the table
		
		String price[] = new String[4]; //array of string
		
		int rows = driver.findElements(By.xpath("//table[@name ='BookTable']//tr")).size();
		System.out.println("The total number of rows are :: " +rows);
		
		//int col = driver.findElements(By.xpath("//th[normalize-space()='Price']")).size();
		//table[@id='fsConnectorRow']/tbody/tr
		//System.out.print("The total number of columns are :: " +col); 

	
	}}