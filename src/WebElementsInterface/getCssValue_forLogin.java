package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue_forLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
	String cssValue = driver.findElement(By.className("ico-login")).getCssValue("color");
	System.out.println(cssValue);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://colorcodefinder.com/rgb-to-hex");
	driver.findElement(By.id("hex")).clear();
	driver.findElement(By.id("hex")).sendKeys(cssValue);
	driver.findElement(By.cssSelector(".button.self-center")).click();
	
	String hexvalue = driver.findElement(By.className("rounded")).getText();
	System.out.println("The converted rgba to hexadecimal value is : " + hexvalue);






	Thread.sleep(11000);
	driver.quit();
}
}
