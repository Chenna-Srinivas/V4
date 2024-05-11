package SelectClass_SingleSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li)[6]/child::a")).click();
	WebElement value = driver.findElement(By.xpath("//div[@class='product-selectors']/child::div[@class='product-viewmode']/child::select"));
	Select s = new Select(value);
	
	Thread.sleep(2000);
	s.selectByVisibleText("List");
	
	
	
}
}
