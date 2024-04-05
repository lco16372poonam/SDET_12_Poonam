package Day14;

import org.testng.annotations.*;

public class AnnotationDemo1 {
	
	@BeforeTest
	public void coding()
	  {
		 System.out.println("You can create many things using this");

	  }
	
	@BeforeClass 
	public void Chemistry()
	  {
		 System.out.println("It is more than Bonding and atoms");

	  }
	
	@BeforeMethod
	 public void Blockchain()
	  {
		 System.out.println("Can we use this tech for transprancy purpose ? ");

	  }
	
  @Test
  public void History() {
	  System.out.println("History is the study of time and events that took place in the past");
  }
  
  @Test
  public void Geography()
  {
	  System.out.println("Geograpghy is more than just studying about landforms");
  }
  
  @AfterMethod
  public void Ai()
  {
	 System.out.println("sunrising industry ");

  }
  
  @AfterClass
  public void Rulingclass()
  {
	 System.out.println("Top 1 percent has 58% share ");

  }
}
