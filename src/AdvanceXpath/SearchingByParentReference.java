package AdvanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingByParentReference {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//div[@class='search-box']/child::form/child::input[1]")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='search-box']/child::form/child::input[1]/following-sibling::input")).click();
		
}
}