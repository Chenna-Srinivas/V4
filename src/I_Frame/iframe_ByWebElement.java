package I_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_ByWebElement {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.dream11.com/");
	Thread.sleep(2000);

	Thread.sleep(2000);
	
	// Switching to Iframe by using Webelemnt as argument
	
	WebElement element = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
	driver.switchTo().frame(element);
	
	driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("8455661277");

	
	
	
	
}
}
