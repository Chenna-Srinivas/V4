package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByAttribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computer");
	driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	
	Thread.sleep(11000);
	driver.quit();
}
}
