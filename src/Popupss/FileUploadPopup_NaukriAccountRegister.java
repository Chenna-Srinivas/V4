package Popupss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup_NaukriAccountRegister {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	
	driver.findElement(By.xpath("//div[@class='radioWrap']/child::div[1]")).click();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\chenn\\Downloads\\MANUAL IMP QSTNS.docx");
	
	
}
}
