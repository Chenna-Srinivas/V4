package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
	Point d = driver.findElement(By.className("ico-login")).getLocation();
	System.out.println("The location of the attribute is : " + d);
	int x = d.getX();
	int y = d.getY();
	System.out.println("Attribute is located at X: " + x);
	System.out.println("Attribute is located at Y: " + y);
	
	
	Thread.sleep(11000);
	driver.quit();
	
}
}
