package Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.instagram.com/");
	
	
	Thread.sleep(2000);
	driver.close();
}
}
