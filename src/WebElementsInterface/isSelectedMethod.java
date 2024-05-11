package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	
	 boolean b1 = driver.findElement(By.id("pollanswers-1")).isSelected();
	System.out.println(b1);
	
	driver.findElement(By.id("pollanswers-1")).click();
	boolean b2 = driver.findElement(By.id("pollanswers-1")).isSelected();
	System.out.println(b2);
}
}
