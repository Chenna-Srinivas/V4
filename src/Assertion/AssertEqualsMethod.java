package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsMethod {
	
	@Test
	public void Link () {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		String url = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String Gurl = driver.getCurrentUrl();
		
		Assert.assertEquals(url, Gurl);
	}
	
	
}
