package Automation_Assignment_Module7;

import org.testng.annotations.Test;

/*
 *  W.a. TestNG program to create group with testing.xml file
 */
public class Quest_19 {
	  @Test(groups = {"red"})
	  public void red1() {
		  System.out.println("this is red gruop");
	  }
	  @Test(groups = {"red"})
	  public void red2() {
		  System.out.println("this is red gruop");
	  }
	  @Test(groups = {"red"})
	  public void red3() {
		  System.out.println("this is red gruop");
	  }
	  
	  @Test(groups = {"green"})
	  public void green1() {
		  System.out.println("this is green gruop");
	  }
	  @Test(groups = {"green"})
	  public void green2() {
		  System.out.println("this is green gruop");
	  }
	  @Test(groups = {"green"})
	  public void green3() {
		  System.out.println("this is green gruop");
	  }
	  
	  @Test(groups = {"red", "green"})
	  public void redandgreen() {
		  System.out.println("this is red&green gruop");
	  }
}
