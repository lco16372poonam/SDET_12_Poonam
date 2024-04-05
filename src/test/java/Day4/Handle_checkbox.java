package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// How to select single check box.
		Thread.sleep(4000);
		//driver.findElement(By.id("monday")).click();
		
		//count the no of options available in check box
		
		List <WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type='checkbox']"));
		
		System.out.println("The number of checkboxes are :: " +checkboxes.size()); //7
		
		//select all the check-boxes (through index value accessing check box)
		
		/*for (int i = 0; i< checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}*/
		
		for(WebElement chk:checkboxes)
		{
			chk.click();
		}
		
//select last two check boxes
		
		/*for(int i= 5; i < checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}*/
		
		
		//select first two check box 
		
		/*	for(int i= 0; i <2; i++)
			{
					checkboxes.get(i).click();
				}*/
			
			// unchecked/  clear all the check boxes
			
		/*	for (int i = 0; i< checkboxes.size(); i++)
			{
				checkboxes.get(i).click();
			}
			
			Thread.sleep(3000);

			for (int i = 0; i< checkboxes.size(); i++)
			{
				checkboxes.get(i).click();
			}*/
			
			// un select the first 3 check boxes
		/*for(int i= 0; i <3; i++)
		{
				checkboxes.get(i).click();
			}
		
		Thread.sleep(3000);
		
		for(int i= 0; i <3; i++)
		{
				checkboxes.get(i).click();
			}*/
			
		//requirement is only to unselect if the check box is selected
		
		/*for(int i=0; i<2; i++)
		{
			checkboxes.get(i).click();

		}
		
		
		Thread.sleep(3000);

		
		for (int i = 0; i< checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}	
		}*/
		
		//driver.close();
	}

}
