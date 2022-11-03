package curs17;

import static org.testng.Assert.assertEquals;

import org.testng.TestException;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String actualTitle = "Test";
	String expectedTitle = "Test2";
	
	
	@Test
	public void checkEquality() {
		
		if(actualTitle.equals(expectedTitle)) {
			
			System.out.println("Test is passed");
			
		}else{
			System.out.println("Test is failed");
		//	throw new TestException("Test Failed")

		}
		
		
	}
	
	@Test
	public void checkStringEquality() {
		assertEquals(actualTitle, expectedTitle);
	}

}
