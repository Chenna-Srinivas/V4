package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accessing_A_Disabled_WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scrolling to the element
		WebElement dbox = driver.findElement(By.xpath("(//h2[@class='title'])[11]"));
		js.executeScript("arguments[0].scrollIntoView(true)",dbox);
		Thread.sleep(2000);
		
		//Entering the value into disabled text box
		js.executeScript("document.getElementById('tb2').value='Srinivas'");
	
	
	}
}
