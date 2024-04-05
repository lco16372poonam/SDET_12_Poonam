package Day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {

	public static void main(String[] args) {
ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("The Title of the page is :: " + driver.getTitle());
		
		driver.findElement(null);


	}

}
