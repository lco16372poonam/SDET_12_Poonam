package Day14;

import org.testng.annotations.*;

public class Annotations {
	
	@BeforeTest
	 public void Login() 
	  {
		  System.out.println("Login...");
	  }
	 
  @Test
  public void Search() 
  {
	  System.out.println("Search Functionality");
  }
  
  @Test()
  public void AdvanceSearch() 
  {
	  System.out.println("Advance Search Functionality");
  }
  
  @AfterTest
	 public void Logout() 
	  {
		  System.out.println("Logout...");
	  }
  
}
