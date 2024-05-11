package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sumiii {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	
	List<WebElement> links =	driver.findElements(By.xpath("//div[@class='header-menu']/child::ul/child::li/child::a"));


	
	for (WebElement e : links) {
		Thread.sleep(1000);
		String ll =e.getAttribute("href");
		System.out.println(ll);
	}








}
}
