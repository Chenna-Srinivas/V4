package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		// Using get(); method
		
		driver.get("https://www.selenium.dev/");
		//Thread.sleep(2000);
		//driver.get("https://www.netflix.com/in/");
		//Thread.sleep(2000);
		//driver.get("https://github.com/");
	
		// Using getCurrentUrl(); method
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//System.out.println(driver.getCurrentUrl());
	
		// Using getTitle() method
		String Title = driver.getTitle();
		System.out.println(Title);
	
		// Using getPagesource() method
		String psource = driver.getPageSource();
	System.out.println("Page Source of the webpage is: "+psource);
	
	// Using getWindowHandle()
	String wHandle = driver.getWindowHandle();
	System.out.println();
	System.out.println("Window handle " + wHandle);
	
	
	
	
	
	
	//Using close() 
	System.out.println("All are executed");	
//	driver.close();
//	driver.quit();
	
	
	
	
	
	

	
	}
}
