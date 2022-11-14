package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabledExample extends BaseTest{
	
	
	@Test
	public void isEnabledExample() {
		
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a[href='#popup_login']")).click();

		WebElement passwordFiled =  driver.findElement(By.cssSelector("div[class*='password_field']>input"));
		
		System.out.println(passwordFiled.isEnabled());
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('disabled', '')", passwordFiled);
		
		
		System.out.println("After disabled :" + passwordFiled.isEnabled());

		
		
		
	}
	

}
