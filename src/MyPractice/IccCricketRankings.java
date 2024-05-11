package MyPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricketRankings {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");

	Thread.sleep(1000);
	
//	Traversing To The Position Of The Team By Taking Parent Reference	
List<WebElement> pos =	driver.findElements(By.xpath("//div[@class='si-table-body']/child::div/child::div[@class='si-table-data si-pos']/child::span[@class='si-text']"));
	
// //	Traversing To The Name Of The Team From Position Tag
List<WebElement> name = driver.findElements(By.xpath("//div[@class='si-table-body']/child::div/child::div[@class='si-table-data si-pos']/child::span[@class='si-text']/parent::div/following-sibling::div[@class='si-table-data si-team']/child::div/child::h3/child::span[@class='si-fname si-text']"));
	
// 	Traversing To The Points Of The Team From Position Tag
List<WebElement> points = driver.findElements(By.xpath("//div[@class='si-table-body']/child::div/child::div[@class='si-table-data si-pos']/child::span[@class='si-text']/parent::div/following-sibling::div[@class='si-table-data si-pts']/child::span"));

//	Traversing To The Rating Of The Team From Position Tag
List<WebElement> Rating = driver.findElements(By.xpath("//div[@class='si-table-body']/child::div/child::div[@class='si-table-data si-pos']/child::span[@class='si-text']/parent::div/following-sibling::div[@class='si-table-data si-rating']/child::span"));



//	 List<List<WebElement>> asList = Arrays.asList(pos,name,points,Rating);
//List<WebElement> comb = 



System.out.println();

for (WebElement e : pos) {
	String poss = e.getText();
	System.out.println("The Position Of The Team is : " + poss);
}

System.out.println();
Thread.sleep(1000);

for (WebElement ee : name) {
	String namee = ee.getText();
	System.out.println("The Name of The Team is : " + namee);
}
System.out.println();
Thread.sleep(1000);

for (WebElement eee : points) {
	String ppoints = eee.getText();
	System.out.println("The Points Of The Team is : "+ ppoints);
}
System.out.println();
Thread.sleep(1000);

for (WebElement eeee : Rating) {
	String rtng = eeee.getText();
	System.out.println("The Rating Of The Team is : "+rtng);
}


System.out.println();
Thread.sleep(2000);
System.out.println("Fetching Details Of The Teams Is Completed Successfully.....");


Thread.sleep(11000);
driver.quit();
}
}
