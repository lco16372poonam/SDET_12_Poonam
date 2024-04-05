package Day8;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.deadlinkcity.com/");
		
			Thread.sleep(3000);
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 int brokenlinks=0;
		
		for(WebElement linkElement:links)
		{
		String hrefValue=linkElement.getAttribute("href"); //value for href attribute

		if(hrefValue==null || hrefValue.isEmpty() )
		{
		System.out.println("href value is empty");
		continue;
		}

		//connection---open ,send
		URL linkurl =new URL(hrefValue); //convert string to URL
		HttpURLConnection conn =(HttpURLConnection) linkurl.openConnection(); //sending request to server
		conn.connect();

		if(conn.getResponseCode()>400) //getResponseCode()--status code
		{
		System.out.println(hrefValue + " "+"Broken Link");
		brokenlinks++;
		}
		else
		{
		System.out.println(hrefValue + " "+" NOT Broken Link");
		}
		}

		System.out.println("Total No of Broekn links are :" +brokenlinks);

	}

}
