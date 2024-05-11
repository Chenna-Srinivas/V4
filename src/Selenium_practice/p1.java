package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			String url="https://demowebshop.tricentis.com/";
			//String url="https://www.google.com/";
			//String url="https://www.facebook.com/";
			//String url = "https://www.instagram.com/";
			
			driver.get(url);
			
//	       By using id locator for facebook url
			
//		driver.findElement(By.id("email")).sendKeys("chennasrinivas44@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("fff");
	
			
			
//         By using name locator for facebook url
//			
//		driver.findElement(By.name("email")).sendKeys("chennasrinivas44@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("////");
//		driver.findElement(By.name("login")).click();
//		
//		By using name locator for instagram url	
//			
//		driver.findElement(By.name("username")).sendKeys("chennasrinivas44@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Srinivas12345");
//		
		
// 		By using clasname locator for demowebshop url
			//driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Computer");
				//"search-box-text"
	
			
//		By using linkText locator for demowebstore		

//	driver.navigate().back();
//	driver.findElement(By.linkText("Log in")).click();
//	Thread.sleep(1000);
//	driver.navigate().back();
//	driver.findElement(By.linkText("Shopping cart")).click();
//	Thread.sleep(1000);
//	driver.navigate().back();
//	driver.findElement(By.linkText("Wishlist")).click();
//	Thread.sleep(1000);
//	driver.navigate().back();

			//Registering 
//			driver.findElement(By.linkText("Register")).click();
//			Thread.sleep(1000);
//		driver.findElement(By.id("gender-male")).click();
//		driver.findElement(By.id("FirstName")).sendKeys("Srinivas");
//		driver.findElement(By.id("LastName")).sendKeys("Chenna");
//		driver.findElement(By.id("Email")).sendKeys("chennasrinivas44@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Srinivas@12345");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("Srinivas@12345");
//		driver.findElement(By.id("register-button")).click();	
//		
			
			
//		Using PartialLinkText() for DemoWebStore
			//driver.findElement(By.partialLinkText("Apparel")).click();

//		Using CssSelector() for DemoWebStore
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Laptop");
		driver.findElement(By.className("search-box-button")).click();
			
			
// 		Using TagName() for DemoWebStore
			
//		driver.findElement(By.tagName("")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		//driver.quit();
		}	
	}