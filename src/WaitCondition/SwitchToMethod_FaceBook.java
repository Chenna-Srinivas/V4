package WaitCondition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToMethod_FaceBook {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/child::ul/child::li[1]/child::a")).click();
	Set<String> fbpage = driver.getWindowHandles();
	for (String s : fbpage) {
		driver.switchTo().window(s);
	if (driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce")) {
		driver.findElement(By.xpath("//*[@id=\"login_popup_cta_form\"]/div/div[8]/div/div/div[1]/child::div/child::span/child::span")).click();
	
	// Switching to Create Account page
		Set<String> createH = driver.getWindowHandles();

		for (String t : createH) {
			driver.switchTo().window(t);
			Thread.sleep(2000);
			if (driver.getCurrentUrl().contains("https://www.facebook.com/reg/?next=%2FnopCommerce")) {			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Srinivas");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chenna");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("srinivas143@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Srinivas@12345");
			Thread.sleep(1000);
			WebElement dd = driver.findElement(By.xpath("((//div[@class='_5k_5'])[1]/child::span/child::span/child::select)[1]"));
			Select date = new Select(dd);
			date.selectByValue("20");
			Thread.sleep(1000);
			WebElement mm = driver.findElement(By.xpath("((//div[@class='_5k_5'])[1]/child::span/child::span/child::select)[2]"));
			Select month = new Select(mm);
			month.selectByVisibleText("Dec");
			Thread.sleep(1000);
			WebElement yy = driver.findElement(By.xpath("((//div[@class='_5k_5'])[1]/child::span/child::span/child::select)[3]"));
			Select year = new Select(yy);
			year.selectByVisibleText("2000");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class='_5k_3']/child::span)[2]/child::input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("srinivas143@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_1lch']/child::button")).submit();	
			}
		}
	}
	}	
}
}