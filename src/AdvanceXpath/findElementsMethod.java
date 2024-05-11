package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
//	List<WebElement> links = driver.findElements(By.tagName("a"));
//	 for (WebElement e : links) {
//		String alllinkk = e.getAttribute("href");
//		System.out.println(alllinkk);
//	}
	
	driver.findElement(By.partialLinkText("Digital")).click();
	List<WebElement> cart = driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));

	for (WebElement e : cart) {
		Thread.sleep(2000);
		e.click();
	}
	Thread.sleep(3000);
	driver.findElement(By.className("cart-label")).click();
	
String qty = 	driver.findElement(By.className("cart-qty")).getText();

if (qty.equalsIgnoreCase("(3)")) {
	System.out.println("Products have been successfully added to the cart");	
}


}
}
