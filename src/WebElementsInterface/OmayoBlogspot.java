package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		Thread.sleep(1000);
		
//		boolean b1D	driver.findElement(By.id("but1")).isDisplayed();
		boolean b1E = driver.findElement(By.id("but1")).isEnabled();
		
		boolean b2D = driver.findElement(By.id("but2")).isDisplayed();
		boolean b2E = driver.findElement(By.id("but2")).isEnabled();
		
		
		
		
		
		
	}
}
