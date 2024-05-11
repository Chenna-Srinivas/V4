package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByPartialAttribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]")).sendKeys("Laptop");
	driver.findElement(By.xpath("//input[contains(@class,'search-box-button')]")).submit();
	
	
	
	Thread.sleep(11000);
	driver.quit();
}
}
