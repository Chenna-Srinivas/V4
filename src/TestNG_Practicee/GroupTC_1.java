package TestNG_Practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTC_1 extends Base {
	
	@Test (groups = "Smoke")
	public void TC () throws InterruptedException {
		Reporter.log("Group One Smoke",true);

	}

		@Test (groups = "Integration")
		public void TCC () {
			Reporter.log("Group One I.T",true);
		}
}
