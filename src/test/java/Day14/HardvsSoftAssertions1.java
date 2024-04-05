package Day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions1 {
	
  //@Test
   void HardAssertion()
  {
	  System.out.println("Testing1.....");
	  System.out.println("Testing2....");

	  System.out.println("Testing3..");
	  System.out.println("Testing4.");
	  System.out.println("Testing5");
	  
	  Assert.assertTrue(false); //false
	  
	  System.out.println("This is the example of hard Assertion");

	  Assert.assertTrue(true); 
	  Assert.assertTrue(true); 
	  Assert.assertTrue(true);  
  }
  
   @Test
  void SoftAssertion()
 {
	  System.out.println(" SOFT Testing1.....");
	  System.out.println("Testing2....");

	  System.out.println("Testing3..");
	  System.out.println("Testing4.");
	  System.out.println("Testing5");
	  
	  SoftAssert sa = new SoftAssert(); //required
	  
	  sa.assertTrue(false); //fail 

	  System.out.println("This is the example of Soft Assertion");

	  sa.assertTrue(true); 
	  sa.assertTrue(true); 
	  sa.assertTrue(true);  
	  
	  sa.assertAll(); //required
 }
  
}
