package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
	// Using TagName() method
	
		String T_Name = driver.findElement(By.id("small-searchterms")).getTagName();
		System.out.println("Tag Name is : " + T_Name);
		
		Thread.sleep(10000);
		driver.quit();
	
}
}
