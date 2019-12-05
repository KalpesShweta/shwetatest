package day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo2 {
  @Test
  public void doRegistratioTest() {
	  String expectedTitle="ssss";
	  String actualTitke="gggg";
	  Assert.assertEquals(actualTitke, expectedTitle);
	  System.out.println("last line");
  }
}
