package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartByReference {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.partialLinkText("Digital")).click();

	List<WebElement> cart = driver.findElements(By.xpath("//div[@class='add-info']/child::div[2]/input"));
//																					we should use following sibling.....	
	for (WebElement e : cart) {
		Thread.sleep(2000);
			e.click();
	}
	Thread.sleep(3000);
	driver.findElement(By.className("cart-label")).click();

	
	
}
}
