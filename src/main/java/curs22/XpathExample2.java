package curs22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest{
	
	@Test
	public void xpathTest() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//parent
		WebElement popupLink =  driver.findElement(By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", popupLink);
		popupLink.click();
		
		//CHILD 
		//  //ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']
		//  //ul[@id='menu_user']/descendant::div[contains(@class, 'login_field')]/child::input[@id='log']
		//  //ul[@id='menu_user']/descendant::input[@id='log']
		WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']"));
		username.sendKeys("TestUser");
		
		// DESCENDANT
		WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']"));
		password.sendKeys("12345@67890");
		
		//following
		WebElement rememberMe =  driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/following::div[contains(@class, 'remember_field')]/input"));
		rememberMe.click();
		
		//preceding
		WebElement submitButton = driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/preceding::div[contains(@class, 'submit_field')]/input"));
		submitButton.click();
		
		
	}

}
