package I_TestListner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ListnerImplementation.class)
public class Base {

	public static WebDriver driver;
	 @BeforeSuite
		public void CS () {
		 Reporter.log("Connecting to the Server",true);
	 }
	 
	 @BeforeTest
	 	public void CD () {
		 Reporter.log("Connecting to the DataBase",true);
	 }
	 
	 @BeforeClass()
	 public void OpenBrowser () {
	Reporter.log("Opening Browser",true);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	}
	 
	@BeforeMethod 
	public void LoginFunctionality () throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chennasrinivas44@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Srinivas@12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		}

	@AfterMethod
	public void LogoutFunctionality () {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

	@AfterClass
	public void CloseBrowser () {
		driver.quit();
		}

	@AfterTest
	public void DDB () {
		Reporter.log("Disconnecting the DataBase....",true);
	}

	@AfterSuite
	public void DS () {
		Reporter.log("Disconnecting the Server....",true);
	}
	
}
