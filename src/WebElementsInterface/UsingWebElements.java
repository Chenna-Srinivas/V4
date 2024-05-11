package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Computer");
//	Thread.sleep(1000);
//
////	Using clear() method
//	driver.findElement(By.cssSelector("#small-searchterms")).clear();
//	Thread.sleep(1000);
//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Books");
//	
//// 	Using submit() method
//	driver.findElement(By.cssSelector(".button-1.search-box-button")).submit();


	
// Using getAttribute() method
	
	String G_Attribute = driver.findElement(By.name("q")).getAttribute("id");
//	String G_Attribute = driver.findElement(By.cssSelector("#small-searchterms")).getAttribute("class");
	driver.findElement(By.id(G_Attribute)).sendKeys("Computer");
	Thread.sleep(5000);
	System.out.println("Attribute Name is : " + G_Attribute);
	

	
	Thread.sleep(10000);
	driver.quit();
}
}
