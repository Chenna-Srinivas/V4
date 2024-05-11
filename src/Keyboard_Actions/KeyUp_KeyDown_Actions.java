package Keyboard_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown_Actions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search = driver.findElement(By.id("small-searchterms"));

	Actions a = new Actions(driver);
	//a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("elenium").build().perform();
	a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("e").keyDown(Keys.SHIFT).sendKeys("l").keyUp(Keys.SHIFT).sendKeys("e").keyDown(Keys.SHIFT).sendKeys("n").keyUp(Keys.SHIFT).sendKeys("i").keyDown(Keys.SHIFT).sendKeys("u").keyUp(Keys.SHIFT).sendKeys("m").perform();

}
}
