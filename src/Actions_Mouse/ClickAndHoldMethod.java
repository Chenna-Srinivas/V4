package Actions_Mouse;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMethod {
//	Link:-	https://selenium08.blogspot.com/2020/01/click-and-hold.html

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	Thread.sleep(1000);
	
//WebElement hold = 	driver.findElement(By.xpath("//ul[@class='ui-sortable']/child::li[1]"));
	Actions a = new Actions(driver);
//WebElement release = 	driver.findElement(By.xpath("//ul[@class='ui-sortable']/child::li[4]"));
	
//	a.moveToElement(hold).clickAndHold().moveToElement(release).release().build().perform();
	
//	a.clickAndHold(hold).moveToElement(release).perform();
//	Thread.sleep(1000);
//	a.release().build().perform();



// S:- Another Website for Click and Drop
	
	driver.get("https://testkru.com/Interactions/DragAndDrop");
/*	
	WebElement hold = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
	WebElement release = driver.findElement(By.xpath("//*[@id=\"dropZone1\"]"));
	
	a.moveToElement(hold).clickAndHold().moveToElement(release).release().build().perform();

*/

// 	S:- Move all the boxes to the respected places               --  Dropdown 2 is not working
//	for (int j = 1; j <=3; j++) {
//		Thread.sleep(1000);
//		WebElement hold = driver.findElement(By.xpath("(//div[@class='box'])["+j+"]"));
//		
//		j=j+1;
//		WebElement release = driver.findElement(By.xpath("//div[@class='container']["+j+"]/child::div"));
//		
//		a.moveToElement(hold).clickAndHold().moveToElement(release).release().build().perform();
//		Thread.sleep(1000);
//		a.release();
//		Thread.sleep(1000);	
//	}


}
}
