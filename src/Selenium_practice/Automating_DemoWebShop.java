package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automating_DemoWebShop {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	Thread.sleep(2000);
	driver.get(URL);
	
// 	Login to Application
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("chennasrinivas44@gmail.com");
	driver.findElement(By.className("password")).sendKeys("Srinivas@12345");
	
//	driver.findElement(By.className("button-1 login-button")).click();
	driver.findElement(By.cssSelector(".button-1.login-button")).click();
	
	
//	driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Computer");

//	driver.findElement(By.cssSelector("input [class = 'button-1 search-box-button']")).click();
//	driver.findElement(By.className("button-1 search-box-button")).click();
	driver.findElement(By.cssSelector(".button-1.search-box-button")).click();

// Adding A Product To The Cart
	driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#add-to-cart-button-72")).click();
	Thread.sleep(2000);
	
//	Opening the Cart Page 
	//We have to scroll up since ShoppingCart Button is not visible
	//Working if manually scroll upwards
//	driver.findElement(By.className("cart-label")).click();
	
	
	
	
	
	Thread.sleep(10000);
	driver.close();
}
}
