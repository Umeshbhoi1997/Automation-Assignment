package Automation_Assignment_Module7;

/*
 *  W.a. junit program to use parameterized demo with multiple
parameter of Facebook login in junit.
 */

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 *  W.a. junit program to use parameterized demo with multiple
parameter of Facebook login in junit
 */
import junit.framework.Assert;
@RunWith(Parameterized.class)

public class Quest_15 {

	String email,password;
		
		WebDriver driver;

		FaceBookLogin fb=null;
		@Before
		public void before() {
			fb=new FaceBookLogin();
		}

		public Quest_15(String email,String password)
		{
			this.email=email;
			this.password=password;
		}

		@Parameterized.Parameters
		public static Collection input() {
			return Arrays.asList(new Object[][] {{"ubhoi1997@gmail.com","umesh@fb"},{"ubhoi1997@gmail.com","umesh@fb"}});
			
		}
		
		
		
		@Test
			public void test() throws Exception {
			fb.Login(email, password);
		}

}
