package SelectClass_MultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	
	Thread.sleep(1000);
	
	WebElement Mselect = driver.findElement(By.xpath("(//div[@class='widget-content'])[11]/child::select"));
	Select ss = new Select(Mselect);
	
	for (int i = 0; i <4 ; i++) {
		ss.selectByIndex(i);
		Thread.sleep(1000);
		
	}
	ss.deselectByIndex(2);
	List<WebElement> Soptions = ss.getAllSelectedOptions();
	
	for (WebElement e : Soptions) {
		String text = e.getText();
		Thread.sleep(1000);
		System.out.println(text);
	}

}
}
