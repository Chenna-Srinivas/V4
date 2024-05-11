package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargettingAgeFromOmayo {
public static void main(String[] args) throws InterruptedException {
	//https://omayo.blogspot.com/2013/05/page-one.html
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

	Thread.sleep(2000);
	int i=1;
List<WebElement> table= driver.findElements(By.xpath("//table[@id='table1']/child::tbody/child::tr/child::td[1]/following-sibling::td[1]"));

//	List<WebElement> table= driver.findElements(By.xpath("(((//div[@class='widget-content'])[5]/child::table/child::thead/following-sibling::tbody/child::tr/child::td)/following-sibling::td)[1]"));
	
for (WebElement e : table) {
String age = 	e.getText();
Thread.sleep(1000);

	System.out.println("Age of the "+i+" Person is: " + age);
i++;
}
}
}
//((//table[@id='table1']/child::tbody/child::tr/child::td)[1]/following-sibling::td)[1]
//[5:35 PM] Sumaiya M Sangreskop
//(((//div[@class='widget-content'tbody/child::tr/child::td)[1]/following-sibling::td)[1]