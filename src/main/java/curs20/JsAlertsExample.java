package curs20;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsAlertsExample extends BaseTest {
	
	
	@Test(priority=1)
	public void simpleJsAlert() throws InterruptedException {
		
		//WebElement alertButton = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		//alertButton.click();		
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		
		Thread.sleep(3000);
		
	//	Alert alertJs = driver.switchTo().alert();
	//	alertJs.accept();
		
		driver.switchTo().alert().accept();
		
		
		WebElement result =  driver.findElement(By.cssSelector("p[id='result']"));
		
		assertEquals(result.getText(), "You successfully clicked an alert");
		
	}
	
	@Test(priority=2)
	public void confirmationJsAlert() throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		WebElement result =  driver.findElement(By.cssSelector("p[id='result']"));
		
		assertEquals(result.getText(), "You clicked: Cancel");
		
	}
	
	@Test(priority=3)
	public void promptJSAlert()throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		
		
		WebElement result =  driver.findElement(By.cssSelector("p[id='result']"));
		
		assertEquals(result.getText(), "You entered: Test");
		
	}
	

}
