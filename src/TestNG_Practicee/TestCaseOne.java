package TestNG_Practicee;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseOne extends Base {

	@Test

public void TC () throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button'][1]")).click();
	}

	@Test
	public void TCC () {
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		
	}
}
