package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExample {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
	
		//System.setProperty("webdrier.chrome.driver", "../chromedriver.exe");
		//WebDriver driver =  new ChromeDriver();
		
		
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://keybooks.ro");
	}
	
	@Test
	public void login() throws InterruptedException  {
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);// bad practice in a fi folosit ca metoda de a astepta elemente
		
	}

}
