package TestNG_Practicee;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTC_2 extends Base{

	@Test(groups = "Smoke")
	public void TCC () {
		Reporter.log("Group Two Smoke",true);
	}
}
