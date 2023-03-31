package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SecondTest {
  @Test(priority=1,description="this method executed first")
  public void f() {
	  System.out.println("from test method f()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforeTest()");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("from afterTest()");
  }
  @Test(priority=2, description="this excuted 2nd")
  public void a() {
	  System.out.println("from test method a()");
  }
  }
  


