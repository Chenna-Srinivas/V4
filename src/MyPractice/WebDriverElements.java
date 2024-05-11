package MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverElements {

/*  WEBDRIVER ELEMENTS	
		WE ARE HAVING A TOTAL OF 13 METHODS
		11 NON-STATIC ABSTRACT METHODS ( DIRECT )
		2 NON-STATIC ABSTRACT METHODS ( INHERITED )*/

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
//	1. get() method
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	/* used to navigate to the particular url.
	 	return type is void
	 	it will accept string type of argument*/
	
//	2. getcurrenturl() method
	String url = driver.getCurrentUrl();
	System.out.println();
	System.out.println("The current URL is: " + url);
	/* used to get the current url of the webpage
	 * return type is String
	 * It will accept NoArguments
	 */

// 	3. getWindowHandle() method
	String wHandle = driver.getWindowHandle();
	System.out.println();
	System.out.println("The Address of the Window is: " + wHandle);
	/* It is used to get the address of the current window
	 * Return type is String
	 * It will accept NoArgument
	 */

// 	4. getWindowHandles() method
	// NOT COMPLETED-- SAME AS GETWINDOWHANDLE() METHOD;
	
//	5. getPageSource() method
	String pSource = driver.getPageSource();
	System.out.println();
	System.out.println("The Source of the Webpage is: " + pSource);
	/* It is used to get the source of the webpage
	 * return type is string
	 * It accpets NoArguments
	 */

// 	6.	getTitle() method
	String Title = driver.getTitle();
	System.out.println();
	System.out.println("The Title of the webpage is: " + Title);
	/* It is used to get the Title of the Webpage 
	 * Return type is String
	 * It accepts NoArguments
	 */
	
// 	7. manage() method  
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	/* This method is used to 
	 * 
	 */
	
// 	8. switchTo() method
//	driver.switchTo().newWindow(WindowType.WINDOW);  ----- DOUBT
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);

// 	9. navigate() method
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);

// 	10. close() method
	driver.close();
	Thread.sleep(2000);
	/* It is used to close the particular/current window 
	 * It accepts NoArguments
	 */

//	11. quit method
	Thread.sleep(11000);
	driver.quit();
	/* It is used to close the Application
	 * It is a NoArgument Method
	 */






}

}
