package Popupss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_SimpleAlert {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");

// Before displaying of alert popup if we switch
//	driver.switchTo().alert();
//  We'll get NoAlertPresentException
	
	driver.findElement(By.className("search-box-button")).click();
	Thread.sleep(1000);
	Alert a = driver.switchTo().alert();
	Thread.sleep(1000);

// Accepting the popup	
//	a.accept();
	
// 	Even if we perform dismiss in simple alert popup it'll be accepted
//	a.dismiss();
	
	
	
	
}
}
