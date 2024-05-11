package Actions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Release_Methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
	Actions a = new Actions(driver);
	for (int i = 0; i < 8; i++) {
		Thread.sleep(1000);
		WebElement cap = driver.findElement(By.xpath("(//div[@id='box"+i+"'])[1]"));
		WebElement cou = driver.findElement(By.xpath("(//div[@id='box10"+i+"'])"));
		
		a.moveToElement(cap).clickAndHold().moveToElement(cou).release().build().perform();
		Thread.sleep(1000);
	}

	
}
}
