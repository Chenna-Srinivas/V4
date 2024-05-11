package I_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_ByIndex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.dream11.com/");
	Thread.sleep(2000);

	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	//	
	driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("8455661277");
	
}
}
