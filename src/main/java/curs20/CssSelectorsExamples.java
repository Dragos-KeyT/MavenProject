package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorsExamples extends BaseTest{
	
	
	@Test
	public void cssSelectorsTest() {
		
		// first-of-type
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement homeMenuItem = driver.findElement(
				By.cssSelector("div[class='menu_main_wrap']>nav[class='menu_main_nav_area']>ul>li:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')", homeMenuItem);

		//nth-of-type
		WebElement contactMenuItem = driver.findElement(
				By.cssSelector("div[class='content_wrap'] nav[class='menu_main_nav_area']>ul>li:nth-of-type(7)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')", contactMenuItem);

		
		//first-of-type
		WebElement newRelesases =  driver.findElement(By.cssSelector("div[id*='sc_tabs_']>ul[class*='sc_tabs_titles']>li:first-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')", newRelesases);
		//nth-of-type
		WebElement comingSoon =  driver.findElement(By.cssSelector("div[id*='sc_tabs_']>ul[class*='sc_tabs_titles']>li:nth-of-type(2)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')", comingSoon);
		//nth-of-type
		WebElement bestSellers =  driver.findElement(By.cssSelector("div[id*='sc_tabs_']>ul[class*='sc_tabs_titles']>li:nth-of-type(3)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')", bestSellers);
		//last-of-type
		WebElement awardWinners =  driver.findElement(By.cssSelector("div[id*='sc_tabs_']>ul[class*='sc_tabs_titles']>li:last-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red;')", awardWinners);
		
		
		
		
	}
	
	

}
