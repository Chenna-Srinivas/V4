package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterThroughXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	String register = driver.findElement(By.xpath("//a[text()='Register']")).getText();
	
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Srinu");
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Chenna");
//	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("demosrinu1212@gmail.com");

//	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("srinu1212@gmail.com");

	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("demochenna1212@gmail.com");

	
	
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Srinivas@12345");
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Srinivas@12345");
	
	driver.findElement(By.xpath("//input[@id='register-button']")).submit();
	
	String email = driver.findElement(By.xpath("//a[text()='demochenna1212@gmail.com']")).getText();
	
	//	boolean b = driver.findElement(By.xpath("//div[text()='Your registration completed']")).isDisplayed();
	
	
	if (register.equalsIgnoreCase(email)) {
		System.out.println("Register Unsuccessfull");
	}
	else {
		System.out.println("Register successfull.....");
	}


Thread.sleep(11000);
driver.quit();
}
}
