package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterVerification {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String URL = "https://demowebshop.tricentis.com/";
	driver.get(URL);
	Thread.sleep(2000);	
	
	String BeforeRegister = driver.findElement(By.linkText("Register")).getText();
	
// Login to the Application
	driver.findElement(By.className("ico-login")).click();
	
	driver.findElement(By.id("Email")).sendKeys("chennasrinivas44@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Srinivas@12345");
	driver.findElement(By.className("login-button")).submit();
	
	
	
//	String AfterRegister = driver.findElement(By.className("ico-logout")).getText();
	
	String AfterRegister = driver.findElement(By.linkText("chennasrinivas44@gmail.com")).getText();
	
	if (BeforeRegister.equalsIgnoreCase(AfterRegister)) {
		System.out.println("Register not Successfull");
		
		
	}
	else {
		System.out.println("Registration is Successfull");
	}

	
	Thread.sleep(10000);
	driver.quit();
	
}
}
