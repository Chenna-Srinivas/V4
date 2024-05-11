package take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebelementScreenshot {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demowebshop.tricentis.com/");
		 takescreenshot();
//		WebElement w= driver.findElement(By.partialLinkText("Digital"));
//		File source = w.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\chenn\\eclipse-workspace\\Selenium_V4\\ScreenShot\\Webelement.jpeg");
//		Files.copy(source, dest);

	}
	public static void takescreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;		 
		  File source = ts.getScreenshotAs(OutputType.FILE);		  
		  File dest = new File("C:\\Users\\chenn\\eclipse-workspace\\Selenium_V4\\ScreenShot\\h.jpg");		  
		  Files.copy(source, dest);
	}

}

