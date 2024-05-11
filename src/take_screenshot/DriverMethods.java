package take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DriverMethods {
public static void main(String[] args) throws IOException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demowebshop.tricentis.com/");
	File source = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\chenn\\eclipse-workspace\\Selenium_V4\\ScreenShot\\Chromedriver.png");
	Files.copy(source, dest);	
}
}
