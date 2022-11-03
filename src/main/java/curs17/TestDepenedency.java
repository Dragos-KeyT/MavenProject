package curs17;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDepenedency {
	
	
	@Test(priority = 1, groups = "LoginFunctionality")
	public void method1() {
		assertTrue(false);
		System.out.println("Method 1");
	}
	@Test(priority = 2,dependsOnMethods = "method1" )
	public void method2() {
		System.out.println("Method 2");
	}
	@Test(priority = 1,dependsOnMethods = "method1", alwaysRun = true )
	public void method3() {
		System.out.println("Method 3");
	}

}
