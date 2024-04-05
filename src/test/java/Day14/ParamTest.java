package Day14;

//Parallel testing/ cross browser testing

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
  
	WebDriver driver;
	
	  @BeforeClass
	  @Parameters("browser")
	   void setup(String br) throws InterruptedException 
	  {
		  if(br.equals("chrome"))
		  {
			  driver = new ChromeDriver();
		  }
		  
		  else if(br.equals("edge"))
		  {
			  driver = new EdgeDriver();

		  }
		  
		  else
		  {
			  driver = new FirefoxDriver();
		  }
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);

	  }
	  
	  @Test(priority =1)
	  void TestLogo()
	 {
		  try
		  {
		  boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();	  
		  Assert.assertEquals(status, true);
		  }
		  catch(Exception e)
		  {
			  Assert.fail();
		  }

	 }
	  
	  @Test(priority =2)
	  void testlogin()
	  {
		 driver.findElement(By.name("username")).sendKeys("Admin"); 
		 driver.findElement(By.name("password")).sendKeys("admin123"); 
		 driver.findElement(By.xpath("//button[@type='submit']")).click(); 

	  }
	  
	  @Test(priority =3)

	  void testHomePageTitle() 
	  {
		  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  }
	  
	 // @AfterClass
	  void tearUp() 
	 {
		  driver.quit();
	 }
	  
}
