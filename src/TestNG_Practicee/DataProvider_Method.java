package TestNG_Practicee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Method {
@Test (dataProvider = "Credentials")
public void TestCase_Register (String fn, String ln, String Eid, String pw, String cpw, String male ) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fn);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(ln);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Eid);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pw);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cpw);
	Thread.sleep(1000);
	if (male.equals("Male")) {
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	}
	else {
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		}

}

@DataProvider (name = "Credentials")
public Object [] [] TestData() {
	Object [] [] d = new Object [2] [6];
	d[0][0] = "Srinivas";
	d[0][1] = "Chenna";
	d[0][2] = "chennasrinivas44@gmail.com";
	d[0][3] = "Srinivas@123";
	d[0][4] = "Srinivas@123"; 
	d[0][5] = "Male";
	
	d[1][0] = "Sumaiya";
	d[1][1] = "Sangreskop";
	d[1][2] = "sumaiya19@gmail.com";
	d[1][3] = "Sumi@123";
	d[1][4] = "Sumi@123";
	d[1][5] = "Female";
	return d;
}

}
