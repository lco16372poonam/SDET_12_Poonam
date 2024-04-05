package Day6;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActionvsActions {

	public static void main(String[] args) {
	ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Action steps
		

	}

}
