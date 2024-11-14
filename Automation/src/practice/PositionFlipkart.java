package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionFlipkart {

	public static void main(String[] args, char[] url) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.shoppersstack.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@alt = 'PONDs Bright Beauty Serum Cream Anti Spot Fairness SPF']")).click();
	
	driver.findElement(By.id("compare")).click();
	
	Set<String> allWindowID = driver.getWindowHandles();
	for(String allIDs : allWindowID) {
		System.out.println(allIDs);
		
		driver.switchTo().window(allIDs);
		Thread.sleep(2000);
		
		String url1 = driver.getCurrentUrl();
		
		if(url1.contains("flipkart")) {
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		break;
		}
		System.out.println(url1);
	
	}
	
	
			

	}

}
