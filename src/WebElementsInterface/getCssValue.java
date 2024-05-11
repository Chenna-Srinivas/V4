package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
	String cssValue = driver.findElement(By.linkText("Register")).getCssValue("color");
	System.out.println();
	System.out.println("The RGBA value of the given attribute is : " + cssValue);
	
//	To convert rgba value to hexadecimal value
	System.out.println();
	System.out.println("Converting RGBA value to HexaDecimal Value.......");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://colorcodefinder.com/");
	driver.findElement(By.linkText("RGB to Hex")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("hex")).clear();
	driver.findElement(By.id("hex")).sendKeys(cssValue);
	driver.findElement(By.className("button")).click();
	
	String hexValue = driver.findElement(By.className("rounded")).getText();
	System.out.println("The converted value of given attribute is : " + hexValue);
	
	
	
	
	Thread.sleep(11000);
	driver.quit();
}
}
