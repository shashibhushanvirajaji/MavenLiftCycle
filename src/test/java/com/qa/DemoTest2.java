package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
  @Test
  public void fifthTest() {
	  System.out.println("from fifthTest from demotest3");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void sixthTest() {
	  System.out.println("from sixth test from demotest3");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void seventhTest() {
	  System.out.println("from seventh test from demotest3");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void eigthTest() {
	  System.out.println("from eight test from demotest3");
	  Assert.assertTrue(true);
  }
}
