package curs21;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{
	
	
	/*
	 * 	XPATH
	 *    //a[@href='https://keybooks.ro/shop/']
	 * 
	 *  CSS
	 *    a[href='https://keybooks.ro/shop/']
	 *    
	 *    
	 *    
	 */
	
	@Test
	public void xpathExample() {
		
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("TestUSer");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TestUSer");
		
		driver.findElement(By.xpath("//input[@value='forever']")).click();
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		// //a[@class='forgot_password']
		
	}
	
	

}
