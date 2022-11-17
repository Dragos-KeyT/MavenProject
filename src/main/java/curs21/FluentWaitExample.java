package curs21;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FluentWaitExample extends BaseTest{
	
	
	@Test
	public void fluentWaitTest() {
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[id='finish']"), "dawdada"));
		
		
		WebElement finish =  driver.findElement(By.cssSelector("div[id='finish']"));
		
		assertEquals(finish.getText(), "Hello World!");
		
	}
	

}
