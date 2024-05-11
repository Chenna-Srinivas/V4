package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInToViewMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		// Scrolling untill the element is visible at the bottom by using FALSE
		//js.executeScript("arguments[0].scrollIntoView(false);",element);
		
		// Scrolling untill the element is visible at the top by using TRUE
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
