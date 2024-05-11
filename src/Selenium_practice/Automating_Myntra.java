package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automating_Myntra {
public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

String URL = "https://www.myntra.com/";
driver.get(URL);
Thread.sleep(2000);

// Login To Myntra

driver.findElement(By.className("sprites-headerUser")).click();


}
}
