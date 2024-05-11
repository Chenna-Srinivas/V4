package CrossBrowser;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 extends Base{
	@Test
	public void TC () throws InterruptedException {
//		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button'][1]")).click();
		Reporter.log("TestCase 1 Executed Successfully...");
	}

		@Test
		public void TCC () {
//			driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
			Reporter.log("TestCase 1 Executed Successfully...");

		}

}
