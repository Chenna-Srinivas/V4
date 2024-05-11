package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals_Method {
	@Test
	public void Link () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		String url = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		
		String Register = driver.findElement(By.xpath("//a[@class='ico-login']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("chennasrinivas44@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Srinivas@12345");
		driver.findElement(By.className("login-button")).submit();
		
		String mail = driver.findElement(By.xpath("//a[text()='chennasrinivas44@gmail.com']")).getText();
		
		Assert.assertNotEquals(url,  mail);
		
		
	
	}
	
}
