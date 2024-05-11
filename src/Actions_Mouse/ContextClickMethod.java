package Actions_Mouse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions a = new Actions(driver);
// S:- Performing RightClick Operation
	WebElement Rclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	a.moveToElement(Rclick).contextClick().perform();
	
// S:- Right click and then select copy
	WebElement copy = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
	//a.contextClick(Rclick).moveToElement(copy).click().perform();
	
	List<WebElement> Texts = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li/span"));

	for (WebElement e : Texts) {
		String ee = e.getText();
		Thread.sleep(1000);
		System.out.println(ee);
	}


}
}
