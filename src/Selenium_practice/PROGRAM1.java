package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PROGRAM1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
	//	Thread.sleep(2000);
	//	String link = "https://www.shoppersstack.com/";
		
		d.get("https://www.shoppersstack.com/");
		Thread.sleep(9000);
	
		d.findElement(By.name("loginBtn")).click();
//		d.findElement(By.name("Email")).sendKeys("demoshopperstack@gmail.com");
//		d.findElement(By.className("MuiInputBase-input")).sendKeys("Stack@123");
//		d.findElement(By.className("MuiButton-label")).click();
//		Thread.sleep(2000);
		
//		Navigate() Method
//		d.findElement(By.linkText("Men")).click();
//		Thread.sleep(1000);
//		d.navigate().back();
//		d.findElement(By.partialLinkText("Women")).click();
//		Thread.sleep(1000);
//		d.navigate().refresh();
//		d.navigate().to("https://www.shoppersstack.com/electronics");
//		Thread.sleep(1000);
		
// 		Ordering a product
//		d.findElement(By.cssSelector("input[class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall  css-k58djc']")).click();
		
	
	}
	
	
	
	
}
