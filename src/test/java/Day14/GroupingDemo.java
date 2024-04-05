package Day14;

/*loginByEmail - sanity & regression
loginByfacebook - sanity
loginBytwitter - sanity

signupbyemail - sanity & regression
signupbyfacebook - regression
signupbytwitter - regression

paymentinrupees - sanity & regression
paymentindollar - sanity
paymentReturnbyBank - regression */

import org.testng.annotations.Test;

public class GroupingDemo {
	
  @Test(priority =1, groups = {"sanity", "regression"})
   void loginByEmail() 
  {
	  System.out.println("Method is loginBeyEmail");
  }
  
  @Test(priority =2, groups = {"sanity"})
  void loginByfacebook() 
 {
	  System.out.println("Method is loginByfacebook");
 }
  
  @Test(priority =3, groups = {"sanity"})
  void loginBytwitter() 
 {
	  System.out.println("Method is loginBytwitter");
 }
  
  @Test(priority =4, groups = {"sanity", "regression"})
  void signupbyemail() 
 {
	  System.out.println("Method is signupbyemail");
 }
  @Test(priority =5, groups = {"regression"})
  void signupbyfacebook() 
 {
	  System.out.println("Method is signupbyfacebook");
 }
  @Test(priority =6)
  void signupbytwitter() 
 {
	  System.out.println("Method is signupbytwitter");
 }
  
  @Test(priority =7, groups = {"sanity", "regression"})
  void paymentinrupees () 
 {
	  System.out.println("Method is paymentinrupees ");
 }
 
  @Test(priority =8, groups = {"sanity"})
  void paymentindollar () 
 {
	  System.out.println("Method is paymentindollar ");
 }
  @Test(priority =9, groups = {"regression"})
  void paymentReturnbyBank() 
 {
	  System.out.println("Method is paymentReturnbyBank");
 }
  
}
