package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	ChromeDriver driver;
	
  @BeforeClass
   void setup() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test(priority = 2, dataProvider="dp")
  void TestLogin(String email, String pwd) 
 {
	  driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	  
	  String exp_title="nopCommerce demo store";
	  String act_title =driver.getTitle();
	  
	  Assert.assertEquals(exp_title, act_title);

 }
  
  @AfterClass
  void tearDown() 
 {
	  driver.close();
 }
  
  @DataProvider(name = "dp", indices = {0,3})
  String[][] loginData()
  {
	  String data[][] = {{"abc@gmail.com", "test"},
			  {"abch422z@gmail.com","test1"},
			  {"abghsbn@gmail.com","testing"},
			  {"david@gmail.com","test123"}};
	  
	  return data;
	  }
  }
  
