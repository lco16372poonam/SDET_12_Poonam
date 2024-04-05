package Day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class InteractWithElementsJS {
	public static void main(String[] args) {
		ChromeDriver driver = new  ChromeDriver();
		
		//WebDrive driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//ChromeDriver js = driver;
		JavascriptExecutor js = driver;
		
		WebElement inputbox = driver.findElement(By.id("name"));
		
		//js.executeScript("argumnets[0].setAttribute('value', 'John')", inputbox);
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		WebElement inputbox1 = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','rac@gmail.com')", inputbox1);
		
		//Radio Button
		//WebElement male_rd = driver.findElement(By.id("male"));
		//js.executeScript("arguments[0].click()", male_rd);

		WebElement female_rd = driver.findElement(By.id("female"));
		js.executeScript("arguments[0].click()", female_rd);
		
		
		//check boxes
		WebElement days = driver.findElement(By.xpath("//label[@for='wednesday']"));
		js.executeScript("arguments[0].click()", days);

		
		//button
		
		driver.switchTo().frame(0);
		WebElement submitb = driver.findElement(By.xpath("//input[@id='FSsubmit']"));
		js.executeScript("arguments[0].click()", submitb);
		
		//drop down
		
		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
		js.executeScript("arguments[0].click();", dd);
		
		String optionvalue ="india";
		String script= "arguments[0].value'" + optionvalue + "';";
		
		driver.executeScript(script, dd);
		
		

	}

}
