package curs16;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
	
	@Test
	public void testSelenium() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://keybooks.ro");
	}

}
