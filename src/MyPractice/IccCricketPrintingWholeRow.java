package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricketPrintingWholeRow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");

	Thread.sleep(2000);

	
for (int i = 2; i < 14; i++) {
	Thread.sleep(2000);
	WebElement pos = driver.findElement(By.xpath("(//div[@class='si-table-row'])["+i+"]/child::div[1]/child::span[1]"));
	WebElement name = driver.findElement(By.xpath("(//div[@class='si-table-row'])["+i+"]/child::div[2]/child::div/child::h3/child::span[2]"));
	WebElement matches = driver.findElement(By.xpath("(//div[@class='si-table-row'])["+i+"]/child::div[3]/child::span[1]"));
	WebElement pts = driver.findElement(By.xpath("(//div[@class='si-table-row'])["+i+"]/child::div[4]/child::span[1]"));
	WebElement rtng = driver.findElement(By.xpath("(//div[@class='si-table-row'])["+i+"]/child::div[5]/child::span[1]"));

	System.out.print(pos.getText()+" "+name.getText()+" "+matches.getText()+" "+pts.getText()+" "+rtng.getText());
	Thread.sleep(1000);
	System.out.println();
}
	
}
}
