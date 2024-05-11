package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation_Facebook {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://www.facebook.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
	Point login_Loc = driver.findElement(By.id("email")).getLocation();
	Point Password_Loc = driver.findElement(By.id("passContaineradw6gt4z by7a")).getLocation();
	
	int x1= login_Loc.getX();
	int x2 = Password_Loc.getX();
	
	System.out.println(x1);
	System.out.println(x2);
	
	if (x1 == x2) {
		System.out.println("Y co-ordinates of email and password text field are same");
		
		
	}
	else {
		System.out.println("Y co-ordinates of email and password text field are not same");
	}
}
}
