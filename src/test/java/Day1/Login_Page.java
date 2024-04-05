package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Login_Page {

	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver(); //open the browser
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");		//pass the url
		
		 driver.findElement(By.name("userName")).sendKeys("mercury");
		 
		 driver.findElement(By.name("password")).sendKeys("mercury");
		 
		 driver.findElement(By.name("submit")).click();
		 
		String act_value = driver.getTitle(); //String value
		 
		 String exp_value ="Login: Mercury Tours";
		 
		 if(act_value.equals(exp_value))
		 {
			 System.out.println("Test is Passed");
		 }
		 else
		 {
			 System.out.println("Test is Failed");
		 }
		 
		 driver.close();
	}

}
