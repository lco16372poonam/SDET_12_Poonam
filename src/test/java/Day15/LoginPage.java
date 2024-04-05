package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//POM class

public class LoginPage {
	
	WebDriver driver; //global
	
	
	//constructor :- automatically initalize the object of the class and provide value of the object and no need to create the object of it
	
	LoginPage(WebDriver driver)  //chrome,edge
	{
		this.driver= driver;
	}
	
	
	//locate the element
	
	By logo= By.xpath("//img[@alt='company-branding']");
	By username = By.name("username");
	By password = By.name("password");
	By clickbutton = By.xpath("//button[@type='submit']");
	
	
	//actions
	
	public void setUserName(String usernam)
	{
		driver.findElement(username).sendKeys(usernam);

	}
	
	public void setPasswdName(String passd)
	{
		driver.findElement(password).sendKeys(passd);

	}
	
	public void clickSubmit()
	{
		driver.findElement(clickbutton).click();

	}
	
	public boolean checkLogo()
	{
		boolean status = driver.findElement(logo).isDisplayed();
		return status;
	}
	
	
}
