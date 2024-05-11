package take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
 driver.get("https://demowebshop.tricentis.com/");
 driver.findElement(By.className("ico-login")).click();
 Thread.sleep(2000);
 TakesScreenshot ts = (TakesScreenshot) driver;
 
  File source = ts.getScreenshotAs(OutputType.FILE);
  
  //File dest = new File("C:\\Users\\chenn\\eclipse-workspace\\Selenium_V4\\ScreenShot\\Home.png");
  File dest = new File("C:\\Users\\chenn\\Desktop\\ScreenShot\\Login.png");
  
  Files.copy(source, dest);
  
  
 
 
	}

}
