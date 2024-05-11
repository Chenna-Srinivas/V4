package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();

	/*	driver.findElement(By.xpath("//a[text() = 'Books\r\n"
	+ "        ']")).click();
*/

	// In link text if there are any concatinations present we cannot use linktext() method
	// so we go for partial link text() method
	
//	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click(); //partialLinkText()
	// By using partialLinkText() there were multiple linktext() are present i.e...2/6 etc..
	// so we will use Xpath by Index method..

	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click(); //Xpath by index
	
	
	
	
}
}
