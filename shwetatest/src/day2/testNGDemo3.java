package day2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNGDemo3 {
	SoftAssert softassert= new SoftAssert();
  @Test
  public void testApp() {
	  String expectedTitle="ssss";
	  String actualTitle="gggg";
	  System.out.println("First Line");
	  softassert.assertEquals(actualTitle, expectedTitle);
  System.out.println("Last Line");
 softassert.assertAll();
  }
}
