package SelectClass_MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAllMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		Thread.sleep(1000);
		
		WebElement Mselect = driver.findElement(By.xpath("(//div[@class='widget-content'])[11]/child::select"));
		Select ss = new Select(Mselect);		
		
//	By using for loop
			for (int i = 0; i <4 ; i++) {
				ss.selectByIndex(i);
				Thread.sleep(1000);
				
			}
			ss.deselectAll();
	}
}
