package TestNG_Practicee;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseTwo extends Base {

	
	@Test
public void TCC () {
	driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
	
}

}
