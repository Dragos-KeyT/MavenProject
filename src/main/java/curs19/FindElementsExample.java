package curs19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample extends BaseTest{
	
	
	@Test
	public void testFindElements() {
		//int counter = 0;
		//driver.findElement(By.cssSelector("img[src*='book" + counter+".jpg']"));
		
		List<WebElement> bookPictures =  driver.findElements(By.cssSelector("figure[class*='sc_image_shape_square']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border : 14px solid red;')", 
				bookPictures.get(1));
		
		for(WebElement element : bookPictures) {
			
			jse.executeScript("arguments[0].setAttribute('style', 'background:green; border : 14px solid red;')", 
					element);
		}

	}
	
	

}
