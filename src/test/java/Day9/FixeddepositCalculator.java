package Day9;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixeddepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

		String file = System.getProperty("user.dir") +"\\ExcelFiles\\Book1.xlsx"; //path of excel sheet

		int rows = ExcelUtils.getRowCount(file, "Sheet1"); //No of rows from Excel table
		
		//read the data from excel
		
		for(int i =1; i<=rows; i++)
		{
			String princ = ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String RateofInterest = ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCellData(file, "Sheet1", i, 2);            //text box
			String per2 = ExcelUtils.getCellData(file, "Sheet1", i, 3);            //drop down
			String fre = ExcelUtils.getCellData(file, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtils.getCellData(file, "Sheet1", i, 5); //compare

			
			//Pass The data to application
			driver.findElement(By.name("principal")).sendKeys(princ);
			driver.findElement(By.name("interest")).sendKeys(RateofInterest);
			driver.findElement(By.name("tenure")).sendKeys(per1);
			
			Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			//Clicking on calculate button
			
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			
			/*JavascriptExecutor js = driver;
			WebElement calculate_btn = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
			
			js.executeScript("arguments[0].click();", calculate_btn);	*/
			
			String  act_mvalue = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			
			//validation and write the data to table
			 
			if( Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed"); //printing  on console
				ExcelUtils.setCellData(file, "Sheet1", i,7 , "Passed");
				ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);	
				
			}
			
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(file, "Sheet1", i, 7 , "Failed");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 7);				
			}	
			
			//Clicking on clear button
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//img[@class='PL5']")).click();	
			
			//JavascriptExecutor js1 = driver;
			/*WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));		
			js.executeScript("arguments[0].click()", clear_btn); */
		}
		
	}
}
