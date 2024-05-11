package SelectClass_MultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingElementsInDropdown_DemoWebShop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.partialLinkText("Digital")).click();
	
WebElement index =	driver.findElement(By.id("products-orderby"));
Select s = new Select(index);
List<WebElement> options = s.getOptions();

// 	Using for Each loop
//for (WebElement e : options) {
//	String Names = e.getText();
//	Thread.sleep(1000);
//	System.out.println(Names);
//}


// 		using for loop
//		for (int i = 0; i < s.getOptions().size(); i++) {
//		String Names = options.get(i).getText();
//			System.out.println(Names);
//			Thread.sleep(1000);
//		}


		
		

		
}
}
