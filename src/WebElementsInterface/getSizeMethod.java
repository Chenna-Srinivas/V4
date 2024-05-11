package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Dimension d = driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).getSize();
	
	int Height = d.getHeight();
	int Width = d.getWidth();
	
	System.out.println();
	System.out.println("The Height is: " + Height);
	System.out.println("The Width is: " + Width);
	
	Thread.sleep(11000);
	driver.quit();
}
}
