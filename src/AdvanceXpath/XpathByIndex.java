package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[contains (text(),'Digital')])[1]")).click();
	
	driver.findElement(By.xpath("(//input[contains(@class,'button-2')])[3]")).click();

	
	
// Checking whether product is added to cart or not
	driver.findElement(By.xpath("//span[@class='cart-label']")).click();
	
//	boolean b = driver.findElement(By.xpath("(//a[contains(text(),'Music 2')])[3]")).isDisplayed();
	
	boolean b = driver.findElement(By.xpath("//a[@class='product-name']")).isDisplayed();
	
	if (b) {
		System.out.println("Product is Successfully added to the cart");
	}
	else {
		System.out.println("Product is not added to the cart");
	}
	Thread.sleep(11000);
	driver.quit();
	
	
}
}
