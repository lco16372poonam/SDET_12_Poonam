package Day8;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.deadlinkcity.com/");
		
			Thread.sleep(3000);
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		
		 /*for(WebElement link:Links){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }*/
		 
		 int brokenlinks=0;
		 
		 for(WebElement linkElement: links )
		 {
			 String hrefValue = linkElement.getAttribute("href");
			 
			 if(hrefValue == null || hrefValue.isEmpty())
			 {
				 System.out.println("href value is empty");
				 continue;
			 }
			 
			 //connection
			 URL linkurl = new URL(hrefValue); //convert the value of  string to url class
			 HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); //sending request to server
			 conn.connect();
			 
			 if(conn.getResponseCode()>400)
			 {
				 System.out.println(hrefValue + "  " +"Broken Link");
					brokenlinks++;
			 }
			 
			 else
			 {
				 System.out.println("Link is not broken");
			 }
		 }
		 
		 System.out.println("Total No of Broekn links are :\" +brokenlinks");
		 
		//driver.close();

	}
}
