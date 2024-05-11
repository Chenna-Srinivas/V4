package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);
	
// 	Using getText() method
	System.out.println("By using getText method");
	System.out.println();
	
	String g_Text = driver.findElement(By.className("cart-label")).getText();
	System.out.println("Text of the Attribute is : " + g_Text);

	String gText = driver.findElement(By.className("ico-register")).getText();
	System.out.println("Text of the Attribute is : " + gText);
	
	String ggText = driver.findElement(By.className("ico-login")).getText();
	System.out.println("Text of the Attribute is : " + ggText);
		
	String gTextt = driver.findElement(By.className("cart-label")).getText();
	System.out.println("Text of the Attribute is : " + gTextt);
	
	
	Thread.sleep(10000);
	driver.quit();
	
	
	
	
	
}
}
