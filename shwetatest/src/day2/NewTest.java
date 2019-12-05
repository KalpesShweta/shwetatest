package day2;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest 
{
	@BeforeTest
	  public void Hi() {
		  System.out.println("Hi");

	  }
  @Test( priority = 1)
  public void Login() {
	  System.out.println("login passed");
	//  throw new SkipException("Error");

  }
  
  @Test( priority = 2 , dependsOnMethods ="Login")
  public void ChnagePasword()
  {
	  System.out.println("ChnagePasword passed");
  }
  @Test( enabled = false)
  public void LogOut()
  {
	  System.out.println("logout passed");
  }
}