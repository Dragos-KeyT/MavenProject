package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import utils.BaseTest;

public class RelativeLocators extends BaseTest{
	
	/*
	 * toLeftOf
	 * toRightOf
	 * below
	 * above
	 * near
	 * 
	 */
	
	@Test
	public void relativeLocatorsExample() {
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		
		//toLeftOf
		WebElement price10_20 =  driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.toLeftOf(By.cssSelector("a[href='life-in-the-garden']")));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price10_20);
		
		//toRightOf	
		WebElement price10_20_2 =  driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.toRightOf(By.cssSelector("a[href='life-in-the-garden']")));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price10_20_2);
		
		//below
		WebElement price3 =  driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.below(By.cssSelector("div[class='wpb_wrapper']>p")));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price3);
		
		//above
		WebElement price4 =  driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']>p"))
				.above(By.cssSelector("h5[class*='sc_title']")));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price4);
		
		
		//near
		WebElement price5 =  driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']>p"))
				.near(By.cssSelector("img[src*='books7']"), 90));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price5);
		
		
		
		
	}
	
	

}
