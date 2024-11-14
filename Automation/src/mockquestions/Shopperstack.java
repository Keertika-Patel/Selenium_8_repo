package mockquestions;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopperstack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/16");
		
		// Find all "Add to Cart" buttons
		driver.findElement(By.xpath("//a[contains(text(),'14 inch laptop')]"));
		WebElement addToCartButton = driver.findElement(By.id("Add To Cart"));
		addToCartButton.click();
		
		 driver.findElement(By.id("compare")).click();
	     Set<String> allWindowIds = driver.getWindowHandles();
	     
	     for(String id : allWindowIds) {
	    	 driver.switchTo().window(id);
	    	 Thread.sleep(3000);
	    	 
	    	 String url = driver.getCurrentUrl();
	    	 if(url.contains("ebay")) {
	    		 break;
	    		 
	    	 }
	    	 driver.manage().window().setSize(new Dimension(150, 150));
	    	 
	    	 
	    	 
	    	 
	     }

		
	}


}
