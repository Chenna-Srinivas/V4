package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByForwardTraversing {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
	
	driver.findElement(By.xpath("(//a[text()='Blue Jeans'])[1]")).click();
	
// Getting the price of the product by ForwardTraversing......
	String price = driver.findElement(By.xpath("//div[@class='prices']/div/span")).getText();
	System.out.println();
	System.out.println("Price of the product is: " + price);
	
// Getting the color of the product by ForwardTraversing......
	String color = driver.findElement(By.xpath("(//div[@class='overview'])[1]/div/h1")).getCssValue("color");
	System.out.println();
	System.out.println("Color of the product is: " + color);
											
// Getting the size of the product by ForwardTraversing
	//String size = driver.findElement(By.xpath(""))

}
}
