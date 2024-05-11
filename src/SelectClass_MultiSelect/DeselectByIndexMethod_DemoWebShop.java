package SelectClass_MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod_DemoWebShop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(1000);
	driver.findElement(By.partialLinkText("Digital")).click();
	
	WebElement index =	driver.findElement(By.id("products-orderby"));
	Select s = new Select(index);
	s.selectByIndex(4);
	Thread.sleep(2000);
	s.deselectByIndex(4);	//We'll get UnsupportedOperation Exceptions
}
}
