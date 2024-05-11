package Actions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActionMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions a = new Actions(driver);

	WebElement register = driver.findElement(By.xpath("(/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/child::ul/child::li/child::a)[1]"));
	Thread.sleep(1000);
	
//	Not Moving the Cursor
	//a.click().perform();
	
	
// 	Moving the Cursor
	//a.moveToElement(register).click().perform();
	
//  S:- Go to the Search Text Box and perform Sendkeys operation
	WebElement Sbox = 	driver.findElement(By.xpath("(//html/body/div[4]/div[1]/div[1]/div[3]/child::form/child::input)[1]"));
	//Thread.sleep(1000);
	//a.moveToElement(Sbox).click().sendKeys("Laptop").perform();
	
// S:- Multiple action in a single line
	// perform sendkeys operation and click on submit
	WebElement Sbtn = driver.findElement(By.xpath("(//html/body/div[4]/div[1]/div[1]/div[3]/child::form/child::input)[2]"));
	//Thread.sleep(1000);
	//a.moveToElement(Sbox).click().sendKeys("Laptop").moveToElement(Sbtn).click().perform();
	
// S:- Instead of moving to the element direct click action
	a.click(Sbox).sendKeys("Laptop").click(Sbtn).perform();
	
}
}
