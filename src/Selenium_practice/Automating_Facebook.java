package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automating_Facebook {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	String URL = "https://www.facebook.com/";
	
	driver.get(URL);
	Thread.sleep(2000);
	
//	Login to Facebook
	
	driver.findElement(By.id("email")).sendKeys("chennasrinivas44@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("shyambujji");
	
driver.findElement(By.className("selected _51sy")).click();

	//	driver.findElement(By.name("login")).click();
	
	
	
	
}
}
