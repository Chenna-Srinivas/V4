package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_Method {
@Test
public void TCpass () throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
	Thread.sleep(2000);
	boolean s = driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
	Assert.assertTrue(s, "Is Selected.......");
//	Assert.assertFalse(s, null);
	
	//boolean s = driver.findElement(By.xpath("//label[text()='Excellent']")).isDisplayed();
	
}
}
