package curs22;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{
	
	@Test(priority = 1)
	public void xpathExampleTest() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement loginPopUp = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')",
				loginPopUp);

		loginPopUp.click();
		
		//OR
		WebElement loginName = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", loginName);
		loginName.sendKeys("TestUser");
		
		//AND
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password' and @name='pwd'] "));
		jse.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 4px solid green')",passwordField);
		
		passwordField.sendKeys("12345@67890");
		
		driver.findElement(By.xpath("//input[@class='submit_button']")).click();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 2)
	public void xpathExampleTest2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		//Contains --> innerHTML
		driver.findElement(By.xpath("//a[contains( text(), 'Settings' )]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'order')]")).click();
		
		//Contains--> attribute value
		WebElement orderTab = driver.findElement(By.xpath("//table[contains(@class, 'woocommerce-orders-table')]/thead/tr/th/span[contains(text(), 'Order')]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", orderTab);

		//index
		WebElement totalTab = driver.findElement(By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[2]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", totalTab);

		//(//tr[contains(@class, 'woocommerce-orders-table__row')]/td[@data-title='Order'])[4]
		////tr[contains(@class, 'woocommerce-orders-table__row')]/td[@data-title='Order']/a[contains(text(), '1688')]
		
		//NOT
		WebElement orders = driver.findElement(By.xpath("//tr[contains(@class, 'woocommerce-orders-table__row')]/td[@data-title='Order']/a[not(contains(text(), '1688'))]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", orders);

		
		
		driver.findElement(By.xpath("//tr[contains(@class, 'woocommerce-orders-table__row')]/td[@data-title='Order']/a[contains(text(), '1688')]")).click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/view-order/1688/");
		
	}
	

}
