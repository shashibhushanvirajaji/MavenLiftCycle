package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {
	
  @Test
  public void fifthTest() {
	  System.out.println("from fifthTest");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void sixthTest() {
	  System.out.println("from sixth test");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void seventhTest() {
	  System.out.println("from seventh test");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void eigthTest() {
	  System.out.println("from eight test");
	  Assert.assertTrue(true);
  }
}
