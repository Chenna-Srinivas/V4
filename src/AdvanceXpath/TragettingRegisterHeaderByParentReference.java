package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TragettingRegisterHeaderByParentReference {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		
	 List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links-wrapper']/child::div[1]/child::ul/child::li/child::a"));
		
	  for(WebElement e : links) {
		  e.click();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  Thread.sleep(1000);
	  }
}
}
