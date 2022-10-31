package curs16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
	
	@Test(invocationCount = 4)
	public void testCeva() {
		System.out.println("Print test ceva");
	}
	
	@RunMultipleTimes(times = 4)
	public void testAltceva() {
		System.out.println("Print test altceva");
	}
	
	@BeforeClass
	public void setup() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		TestExample testExample =  new TestExample();
		
		for(Method metod : testExample.getClass().getDeclaredMethods()) {
			
			if(metod.isAnnotationPresent(RunMultipleTimes.class)) {
				
				RunMultipleTimes annotation  = metod.getAnnotation(RunMultipleTimes.class);
				
				for(int i =0; i<annotation.times(); i++) {
					metod.invoke(testExample);
				}
				
			}
			
		}
	
	

}
	}
