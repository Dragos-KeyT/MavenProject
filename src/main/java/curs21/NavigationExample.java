package curs21;

import org.testng.annotations.Test;

import utils.BaseTest;

public class NavigationExample extends BaseTest{
	
	
	@Test
	public void navigationTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.get("http://emag.ro");
		Thread.sleep(2000);
		driver.navigate().to("http://altex.ro");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
	
	

}
