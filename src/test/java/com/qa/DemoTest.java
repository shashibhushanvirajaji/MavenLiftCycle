package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void firstTest() {
	  System.out.println("from first test");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void secondTest() {
	  System.out.println("from second test");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void thirdTest() {
	  System.out.println("from third test");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void fourthTest() {
	  System.out.println("from fourth test");
	  Assert.assertTrue(true);
  }
}
