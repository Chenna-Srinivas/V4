package Popupss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_NotificationPopup {
public static void main(String[] args) throws InterruptedException, AWTException {
	
// 	S: To avoid Notification popup...	
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://www.easemytrip.com/");
	
	}
}
