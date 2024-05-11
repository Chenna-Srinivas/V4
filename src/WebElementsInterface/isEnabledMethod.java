package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	
	
	boolean b = driver.findElement(By.className("search-box-text")).isDisplayed();
	boolean b1 = driver.findElement(By.cssSelector(".button-1.search-box-button")).isEnabled();
	
	
	if (b) {
		System.out.println("Element is Displayed");
		
		if (b1) {
			System.out.println("Element is Enabled");
			driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		}
		else {
				System.out.println("Element is Not Enabled");
			}
		
	}
		else {
			System.out.println("Element is not Displayed");
		}
	}
	
	 
}

