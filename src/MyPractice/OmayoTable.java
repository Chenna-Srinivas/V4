package MyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoTable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	
// xpath -- ((//div[@id='HTML30']/child::div)[1]/child::table/child::tbody/child::tr)[1]/child::td[1]

	for (int i = 1; i <=4; i++) {
		for (int j = 1; j <=3; j++) {
			Thread.sleep(1000);
			WebElement table = driver.findElement(By.xpath("((//div[@id='HTML30']/child::div)[1]/child::table/child::tbody/child::tr)["+i+"]/child::td["+j+"]"));		
			
			System.out.print(table.getText()+" ");
			
			
		}
		System.out.println();
	}



}
}
