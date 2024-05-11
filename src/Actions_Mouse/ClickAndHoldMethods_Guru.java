package Actions_Mouse;
// --------------------------IRRITATING PROGRAM--------------
//--------------------------IRRITATING PROGRAM--------------
//--------------------------IRRITATING PROGRAM--------------
//--------------------------IRRITATING PROGRAM--------------

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMethods_Guru {
public static void main(String[] args) throws InterruptedException {
	//https://www.demo.guru99.com/test/drag_drop.html
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	
	Actions a = new Actions(driver);

	
	WebElement A = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement B = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));	
	//a.moveToElement(A).clickAndHold().moveToElement(B).release().build().perform();
	
	WebElement bb = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement aa = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	
	//a.moveToElement(bb).clickAndHold().moveToElement(aa).release().build().perform();
	
	
	WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement ss = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));	
	//a.moveToElement(s).clickAndHold().moveToElement(ss).release().build().perform();

	
	WebElement c = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));	
	//a.moveToElement(c).clickAndHold().moveToElement(d).release().build().perform();
	a.dragAndDrop(s, ss).build().perform();
	a.dragAndDrop(c, d).perform();
	a.dragAndDrop(bb, aa).perform();
	a.dragAndDrop(A, B).perform();
	
	
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	for (int i = 2; i <= 4; i++ ) {
//		Thread.sleep(1000);
//		if (i==2 || i == 4) {
//			WebElement A = driver.findElement(By.xpath("(//a[@class='button button-orange'])["+i+"]"));
//			WebElement B = driver.findElement(By.xpath("(//li[@class='placeholder'])["+i+"]"));	
//			a.moveToElement(A).clickAndHold().moveToElement(B).release().build().perform();
//		}
//Thread.sleep(1000);		
//	}

	
	
	
	
	
	
//	Using Drag and Drop method	
//	a.dragAndDrop(A, B);
}
}
