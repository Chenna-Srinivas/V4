package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	try {
	boolean b = driver.findElement(By.className("ui-auto")).isDisplayed();
	
	
	if (b) {
		System.out.println("Web Element is Present ..");
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("Computer");
	}
	}
	catch (Exception e) 
	 {
		System.out.println("The Web Element is Not Displayed");
	}

	
	Thread.sleep(11000);
	driver.quit();
}
}
