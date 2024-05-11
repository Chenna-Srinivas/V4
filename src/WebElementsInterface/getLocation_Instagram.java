package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation_Instagram {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
	Point pUsername = driver.findElement(By.name("username")).getLocation();
	Point pPassword = driver.findElement(By.name("password")).getLocation();
	
	int x1 = pUsername.getX();
	int x2 = pPassword.getX();
	
	System.out.println(x1);
	System.out.println(x2);
	
	if (x1==x2) {
		System.out.println("They are same");
		
	}
	else {
		System.out.println("They are not same ");
	}



Thread.sleep(11000);
driver.quit();

}
}
