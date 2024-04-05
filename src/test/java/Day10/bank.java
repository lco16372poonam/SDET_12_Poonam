package Day10;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Day9.ExcelUtils;

public class bank  {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

		String file = System.getProperty("user.dir") +"\\ExcelFiles\\Book2.xlsx"; //path of excel sheet

		int rows = ExcelUtils.getRowCount(file, "Sheet1"); //No of rows from Excel table
		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();	
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.id("mat-input-2")).clear();
		
		//read the data from excel
		
		for(int i =1; i<rows; i++)
		{
			String ida = ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String length = ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String interest = ExcelUtils.getCellData(file, "Sheet1", i, 2);           
			String comp = ExcelUtils.getCellData(file, "Sheet1", i, 3);            
			String exp_mvalue = ExcelUtils.getCellData(file, "Sheet1", i, 4); //compare

			
			//Pass The data to application
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(ida);
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(length);
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(interest);
			
			List <WebElement> drpdown = driver.findElements(By.xpath("//span[@class=\"mat-option-text\"]")); //Drop down list
		 
			for(int c=1; c<=drpdown.size(); c++)
			{
				System.out.println(drpdown.get(c).getText());
				
				if(drpdown.get(c).getText().equals(comp))
				{
					Thread.sleep(3000);
					drpdown.get(c).click();
					break;
				}
			}
			
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			String  act_mvalue = driver.findElement(By.xpath("//*[@id=\"cdAPY\"]")).getText();
			
			//validation and write the data to table
			 
			if( exp_mvalue == act_mvalue)
			{
				System.out.println("Test Passed"); 
				ExcelUtils.setCellData(file, "Sheet1", i,6 , "Passed");	
				
			}
			
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(file, "Sheet1", i, 6 , "Failed");
								
			}	
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.id("mat-input-1")).clear();
			driver.findElement(By.id("mat-input-2")).clear();
			
		}
	}
}


