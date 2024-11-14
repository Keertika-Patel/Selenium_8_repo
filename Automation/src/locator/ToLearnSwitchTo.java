package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(15000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver,"flipkart");
		Point flipkartPosition = driver.manage().window().getPosition();
		
		switchToWindow(driver,"ebay");
		Point ebayPosition = driver.manage().window().getPosition();
		
		driver.manage().window().setPosition(flipkartPosition);
		
		switchToWindow(driver,"flipkart");
		driver.manage().window().setPosition(ebayPosition);
	}
	
	public static void switchToWindow(WebDriver driver,String url) {
		Set<String> allWindowIds = driver.getWindowHandles();
		driver.getWindowHandles();
		
		for(String id : allWindowIds ) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains("flipkart")) {
				break;
			}
		}
		//driver.manage().window().maximize();
		Point ebayPosition = driver.manage().window().getPosition();
		
		
		
	}

}
