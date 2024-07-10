package Automation_Assignment_Module7;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/*
 * w.a.junit program to handled Assert class with all method to check its
pass or fail

 */

public class Quest_12 {


	@Test
	public void test1() {
		int a=12,b=6;
		
		Assert.assertTrue(a>b);
		Assert.assertFalse(a<b);
	}
	

	@Test
	public void test2() {
		int a=12,b=12;
		int c=5;
		//Assert Same and Assert equals are same use Function
		Assert.assertSame(a, b);
		Assert.assertNotSame(a, c);
//		Assert.assertEquals(b, a);
//		Assert.assertNotEquals(b, a);;
	}
	

	@Test
	public void test3() {
		String name="Deepak";
		String name1=null;
		
		
		Assert.assertNotNull(name);
		Assert.assertNull(name1);
		
	}

	@Test
	public void test4() {
		int[] a= {12,34,56,78};
		int[] b= {12,34,56,78};
		
		
		Assert.assertArrayEquals(a, b);
	}
	@Ignore
	@Test
	public void SelfFail() {
		System.out.println("This function is self failed....");
		fail();
	}
}
