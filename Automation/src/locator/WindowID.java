package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowID {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(15000);
		driver.findElement(By.linkText("Facebook")).click();
		 Set<String> allWindowHandles = driver.getWindowHandles();

		 for(String id :allWindowHandles) {
			 System.out.println(id);
			 
		 }
	}

}
