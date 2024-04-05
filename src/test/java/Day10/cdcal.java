package Day10;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cdcal {

		public static void main(String[] args) throws IOException, InterruptedException {
			
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://www.nerdwallet.com/calculator/cd-calculator");
			String file = System.getProperty("user.dir") +"\\ExcelFiles\\Book4.xlsx";
			int rows = ExcelUtils.getRowCount(file, "Sheet1"); 
			
			//read the data from excel
			
			for(int i =1; i<=rows; i++)
			{
				String princ = ExcelUtils.getCellData(file, "Sheet1", i, 0);
				String RateofInterest = ExcelUtils.getCellData(file, "Sheet1", i, 1);
				String per1 = ExcelUtils.getCellData(file, "Sheet1", i, 2);            //text box
				String exp_mvalue = ExcelUtils.getCellData(file, "Sheet1", i, 4); //compare

				
				//Pass The data to application
				WebElement box1 = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
				box1.clear();
				box1.sendKeys(princ);
				
				
				WebElement box2 = driver.findElement(By.xpath("//input[@id='structured-content-client-1-2-2']"));
				box2.clear();
				box2.sendKeys(RateofInterest);
				
				WebElement box3 = driver.findElement(By.xpath("//*[@id=\"structured-content-client-1-2-3\"]"));
				box3.clear();
				box3.sendKeys(per1);
				
				String  act_mvalue = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/p")).getText();
				
				//validation and write the data to table
				 
				if( Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
				{
					System.out.println("Test Passed"); //printing  on console
					ExcelUtils.setCellData(file, "Sheet1", i,6 , "Passed");
					ExcelUtils.fillGreenColor(file, "Sheet1", i, 6);	
					
				}
				
				else
				{
					System.out.println("Test Failed");
					ExcelUtils.setCellData(file, "Sheet1", i, 6 , "Failed");
					ExcelUtils.fillRedColor(file, "Sheet1", i, 6);				
				}	
			}
			
		}
	}

