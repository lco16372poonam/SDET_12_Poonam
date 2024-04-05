package Day15;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
	
	WebDriver driver;
	loginPage2 lp;
	
	@BeforeClass
   void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Thread.sleep(3000);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
	
	
	@Test(priority=2)
	void TestLogin()
	{
		loginPage2 lp = new loginPage2(driver);
		lp.setUserName("Admin");
		lp.setPasswdName("admin123");
		lp.clickSubmit();	
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@Test(priority=1)
	void Logo_check()
	{
		  lp = new loginPage2(driver);
		  Assert.assertEquals(lp.checkLogo(),true);
		  //Assert.assertEquals(true,true);		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}

