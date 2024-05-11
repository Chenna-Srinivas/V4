package Popupss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
	
	driver.findElement(By.id("simple")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(1000);
	a.accept();
	
	driver.findElement(By.id("confirm")).click();
	Alert confirm = driver.switchTo().alert();
	Thread.sleep(1000);
	confirm.dismiss();
	
	driver.findElement(By.id("prompt")).click();
	Alert prompt = driver.switchTo().alert();
	Thread.sleep(2000);
	prompt.sendKeys("Sumi");
	Thread.sleep(2000);
	prompt.accept();
	String text = driver.findElement(By.id("prompt_demo")).getText();
	System.out.println(text);

}
}
