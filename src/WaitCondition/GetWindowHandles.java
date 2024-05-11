package WaitCondition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	
	driver.findElement(By.xpath("//*[@id=\"HTML37\"]/child::div[1]/child::p/child::a")).click();
	
	Set<String> allWindow = driver.getWindowHandles();
	System.out.println(allWindow);
	
	for (String s : allWindow) {
		
		driver.switchTo().window(s);	
		
		if (driver.getCurrentUrl().contains("https://the-internet.herokuapp.com/windows/new")) {
			driver.close();
		}
	
	}
	
	
	
	
	
}
}
