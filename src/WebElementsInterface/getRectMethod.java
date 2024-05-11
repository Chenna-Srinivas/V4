package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	
	Rectangle r = driver.findElement(By.name("username")).getRect();
	
	int height = r.getHeight();
	int width = r.getWidth();
	int x1 = r.getX();
	int y1 = r.getY();
	
	System.out.println("Height of the Attribute is: " + height);
	System.out.println("Width of the Attribute is: " + width);
	System.out.println("X-Coordinate of the Attribute is: " + x1);
	System.out.println("Y-Coordinate of the Attribute is: " + y1);
	
	
	Thread.sleep(11000);
	driver.quit();
}
}
