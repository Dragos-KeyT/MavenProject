package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelectedExample extends BaseTest{
	
	
	@Test
	public void isSelectedTest() {
		
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a[href='#popup_login']")).click();
		
		WebElement username =  driver.findElement(By.cssSelector("div>input[id='log']"));
		
		System.out.println(username.isSelected());
		username.click();
		System.out.println("After click :" + username.isSelected());
		
		System.out.println("---------------------------------");
		
		
		WebElement rememberMe =  driver.findElement(By.cssSelector("div>input[id='rememberme']"));
		System.out.println(rememberMe.isSelected());
		
		rememberMe.click();
		System.out.println("After click :" + rememberMe.isSelected());

		
		

	}
	

}
