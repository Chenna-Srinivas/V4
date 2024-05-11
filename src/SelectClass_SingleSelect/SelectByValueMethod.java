package SelectClass_SingleSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
	
			driver.findElement(By.xpath("(//ul[@class='top-menu']/child::li)[4]/child::a")).click();
	
WebElement  value	=driver.findElement(By.xpath("//div[@class='product-page-size']/child::select"));
	Select s = new Select(value);
	Thread.sleep(2000);
	s.selectByValue("https://demowebshop.tricentis.com/apparel-shoes?pagesize=4");
	
	}
}
