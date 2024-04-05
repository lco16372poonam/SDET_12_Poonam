package Day10;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Citbank {
			public static void main(String[] args) throws IOException, InterruptedException {
				
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				
				driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

				String file = System.getProperty("user.dir") +"\\ExcelFiles\\Book2.xlsx"; 

				int rows = ExcelUtils.getRowCount(file, "Sheet1");
				
				//read the data from excel
				
				for(int i =1; i<=rows; i++)
				{
					String ida = ExcelUtils.getCellData(file, "Sheet1", i, 0);
					String legthofcd = ExcelUtils.getCellData(file, "Sheet1", i, 1);
					String Interestrate = ExcelUtils.getCellData(file, "Sheet1", i, 2);            	
					String comp = ExcelUtils.getCellData(file, "Sheet1", i, 3);            
					String exp_mvalue = ExcelUtils.getCellData(file, "Sheet1", i, 4); 

					
					//Pass The data to application
					driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c102-0']")).sendKeys(ida);
					driver.findElement(By.id("mat-input-1")).sendKeys(legthofcd );			
					driver.findElement(By.id("mat-input-2")).sendKeys(Interestrate);			
					Select perdrp = new Select(driver.findElement(By.id("mat-select-value-1")));
					perdrp.selectByVisibleText(comp);
						
					
					//Clicking on let's run the number button
					// drop down //span[@class="mat-option-text"]
					
					// abhi na  //*[@class=\"cdk-overlay-pane\"]/div/div/mat-option/span
				driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
					
					/*WebElement run_btn = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']"));				
					js.executeScript("arguments[0].click();", run_btn);	
					*/
					String  act_mvalue = driver.findElement(By.xpath("//span[@id='cdAPY']")).getText();
					
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
		

