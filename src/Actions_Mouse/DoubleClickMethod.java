package Actions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions a = new Actions(driver);
	
//	S:- Move to the webelement and perform double click operation on it 	
	WebElement Dclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	//a.moveToElement(Dclick).doubleClick().perform();

	
// S:- Without using move to element
	a.doubleClick(Dclick).perform();
	
	
}
}
