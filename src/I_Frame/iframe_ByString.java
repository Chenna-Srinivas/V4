package I_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_ByString {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		// Switching to Iframe by using String as argument
		
		driver.switchTo().frame("send-sms-iframe");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("8455661277");
		
		// S: CHANGING THE LANGUAGE OF THE WEBPAGE --
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//div[@class='select-selected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='hindi']")).click();
		
	}
}
