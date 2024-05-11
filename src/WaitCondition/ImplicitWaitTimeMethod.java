package WaitCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTimeMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("(//html/body/div[4]/div[1]/div[1]/div[2]/div[1]/child::ul/child::li)[2]/child::a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("chennasrinivas44@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Srinivas@12345");
	
	driver.findElement(By.xpath("//html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/child::input")).click();
	
}
}
