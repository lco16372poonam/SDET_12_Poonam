package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Testing_Practicetable1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		//Table of html
		/*int rows = driver.findElements(By.tagName("tr")).size();
		System.out.print("The total number of rows are " +rows); //14*/	
		
		int rows = driver.findElements(By.xpath("//table[@name ='BookTable']//tr")).size();
		System.out.println("The total number of rows are :: " +rows);
		
		//int col = driver.findElements(By.tagName("td")).size();
		//System.out.print("The total number of columns are :: " +col); // 46
		
		//int col = driver.findElements(By.xpath("")).size();
		//System.out.print("The total number of columns are :: " +col); 
		
		//String print= driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		//System.out.println(print);
		
		/*for (int r=2; r<=rows; r++)
		{
			 for (int c=1; c<=col; c++)
			 {
				String value=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.print(value);

			 }
			 System.out.println();

		}*/
		
	/*	for(int r=2;r<rows;r++)
		{
			String value1=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

			if(value1.equals("Amit"))
					{
				String book=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				 System.out.println (book);
					}
		} */
		
		int sum = 0;
		 for(int r=2; r<rows; r++)
		 {
				String price=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				sum = sum +Integer.parseInt(price);
		 }
		 
		 System.out.println ("The price is ::" +sum); //7100

	}
}
