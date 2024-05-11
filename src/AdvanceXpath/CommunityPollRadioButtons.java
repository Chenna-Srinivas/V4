package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPollRadioButtons {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");

	Thread.sleep(2000);
	
List<WebElement> radio = driver.findElements(By.xpath("//div[@class='block block-poll']/child::div/following-sibling::div/child::div/child::ul/child::li/child::input"));
	for (WebElement e : radio) {
		e.click();
		Thread.sleep(2000);
	}
}
}
