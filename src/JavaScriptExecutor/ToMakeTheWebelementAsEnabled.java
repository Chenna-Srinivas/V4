package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeTheWebelementAsEnabled {
public static void main(String[] args) throws InterruptedException {
	// Using removeAttribute method......

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement element = driver.findElement(By.id("but1"));
	WebElement element2 = driver.findElement(By.id("but2"));
	
	js.executeScript("arguments[0].scrollIntoView(true)", element2);
	Thread.sleep(2000);
	js.executeScript("arguments[0].removeAttribute('disabled');", element);
	


}
}
