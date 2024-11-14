package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/19");
		
		//getWindowHandle - return only one window id 
		System.out.println(driver.getWindowHandle());
		
		//click on compare icon - it launch multiple windows
		driver.findElement(By.id("compare")).click();
		
		//getWindowHandles()- return multiple window ID
		System.out.println(driver.getWindowHandles());
		
		driver.quit();//close the multiple window 
	}

}
