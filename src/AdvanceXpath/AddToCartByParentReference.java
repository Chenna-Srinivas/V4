package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartByParentReference {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Digital downloads")).click();
	
List<WebElement> cart = driver.findElements(By.xpath("(//div[@class='details'])/child::div[@class='add-info']/child::div[@class='buttons']/child::input"));
	for (WebElement e : cart) {
		e.click();
		Thread.sleep(2000);
		
	}
	
}
}
