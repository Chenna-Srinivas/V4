package AdvanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingToCartAndRemovingMaxPriceProduct {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.partialLinkText("Digital")).click();

	List<WebElement> cart = driver.findElements(By.xpath("//div[@class='add-info']/child::div[@class='buttons']/child::input"));
									
	for (WebElement e : cart) {
		Thread.sleep(2000);
			e.click();
	}
	Thread.sleep(3000);
	driver.findElement(By.className("cart-label")).click();
	
// Getting price of the products
List<WebElement> prices =	driver.findElements(By.xpath("//td[@class='subtotal nobr end']/child::span[@class='product-subtotal']"));
int i=1;
int temp = 0;

for (WebElement pp : prices) {
		String productprice = pp.getText();
		System.out.println("Price of the "+i+" product "+productprice);
	i++;
	
	int price = (int)Double.parseDouble(productprice);
	System.out.println(price);
	if (temp<price) {
		temp=price;
	}
	}
	System.out.println("Highest price of the product is : "+temp);
	
	driver.findElement(By.xpath("//td[@class='subtotal nobr end']/child::span/following-sibling::span[contains(text(),'"+temp+"')]/parent::td/preceding-sibling::td[@class='remove-from-cart']/child::input")).click();
//	driver.findElement(By.xpath("//td[@class='subtotal nobr end']/child::span/following-sibling::span[text()='"+temp+"']"));
	Thread.sleep(1000);
	driver.findElement(By.name("updatecart")).click();







//	To remove a particular product
//	driver.findElement(By.xpath("(//tbody/child::tr[@class='cart-item-row']/child::td[@class='remove-from-cart']/child::input)[1]")).click();









}
}
