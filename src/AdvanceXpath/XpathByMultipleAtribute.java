package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAtribute {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
//	By using AND 	
	//driver.findElement(By.xpath("//input[@name='q' and @id='small-searchterms']")).sendKeys("Computer");

// By using OR
//	Original----driver.findElement(By.xpath("//input[@name='q' or @id='small-searchterms']")).sendKeys("Computer");
	driver.findElement(By.xpath("//input[@name='q' or @id='small-s']")).sendKeys("Computer");

}
}
