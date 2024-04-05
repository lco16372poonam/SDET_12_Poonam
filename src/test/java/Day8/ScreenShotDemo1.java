package Day8;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		
		

	}

}
