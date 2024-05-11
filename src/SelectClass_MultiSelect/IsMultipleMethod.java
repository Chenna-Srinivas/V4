package SelectClass_MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	
	Thread.sleep(1000);
	
	WebElement Mselect = driver.findElement(By.xpath("(//div[@class='widget-content'])[11]/child::select"));
	Select ss = new Select(Mselect);	
	boolean type = ss.isMultiple();
	System.out.println("Is The Selected Dropdown Box a MultiSelect Type: " + type);
	
	Thread.sleep(1000);
	
	WebElement Sselect = driver.findElement(By.xpath("(//div[@class='widget-content'])[12]/child::select"));
	Select s = new Select(Sselect);
		boolean ttype= s.isMultiple();
		System.out.println("Is The Selected Dropdown Box a MultiSelect Type: " + ttype);

}
}
