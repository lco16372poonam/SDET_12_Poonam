package Day5;

//fill the textboxes and data into frame no 2 and clear the textbox on the webpage 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Registration is not working");
		
		driver.switchTo().frame("frm2");
		 
		Thread.sleep(3000);

		WebElement drp = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		
		Select drpdwn = new Select(drp);
		
		drpdwn.selectByVisibleText("- Basic Controls");
		Thread.sleep(3000);

		
		//input[@id="firstName" and @placeholder="Enter First Name"]
		
	driver.findElement(By.xpath("//input[@id=\"firstName\" and @placeholder=\"Enter First Name\"]")).sendKeys("Kashvi");
	driver.findElement(By.xpath("//input[@id=\"lastName\" and @placeholder=\"Enter Last Name\"]")).sendKeys("Suthar");
	
	driver.findElement(By.xpath("//input[@id=\"femalerb\"]")).click();
	Thread.sleep(3000);
	
	//driver.findElement(By.id("englishchbx")).click();
	
	List <WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"bcCheckBox\"][@type='checkbox']"));
	
	//System.out.println("The number of checkboxes are :: " +checkboxes.size()); 
	
	for (int i = 0; i< 2; i++)
	{
		checkboxes.get(i).click();
	}
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='email'and @placeholder='Enter Email']")).sendKeys("Suthar@gmail.com");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='password'and @placeholder='Enter Password']")).sendKeys("aiims");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//button[@id=\"clearbtn\" and  @onclick=\"clearFeilds()\"]")).click();
	
	
	//driver.findElement(By.xpath("//button[@id='registerbtn']")).click();

	//driver.findElement(By.cssSelector("button#registerbtn")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//input[@id='name']")).clear();
	}
}
