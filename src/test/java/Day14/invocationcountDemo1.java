package Day14;

import org.testng.annotations.Test;

public class invocationcountDemo1 {
  @Test(invocationCount = 5)
   void test()
  {
	  System.out.println("Invocation testing is running now");
  }
}
