package SelectClass_MultiSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		Thread.sleep(1000);
		
		WebElement Mselect = driver.findElement(By.xpath("(//div[@class='widget-content'])[11]/child::select"));
		Select ss = new Select(Mselect);		

//		Getting the Size of Dropdown using getOptions.size();		
		int size = ss.getOptions().size();
		 
//	By using for loop
			for (int i = 0; i <size ; i++) {
				ss.selectByIndex(i);
				Thread.sleep(1000);
				
			}
			ss.deselectAll();
	
			
//	 		Printing options present in dropdown box
			List<WebElement> options = ss.getOptions();
	
				for (WebElement e : options) {
					String Name = e.getText();
					Thread.sleep(1000);
					System.out.println(Name);
				}
	
			//  S:- CHECK WHETHER AUDI IS PRESENT IN THE DROPDOWN OR NOT
				
				String data = "Audi";
				for (int i = 0; i < ss.getOptions().size(); i++) {
					String Names = options.get(i).getText();
					Thread.sleep(1000);
					if (data.contains(Names)) {
						System.out.println(Names + " Is Present In Dropdown");
					}
				
				}	
	
	
	
	
	
	
	
	
	
	}

}
