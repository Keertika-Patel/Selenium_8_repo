package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Facebook")).click();
	
	Set<String> windowID = driver.getWindowHandles();
	String windowTittle = driver.getTitle();
	for(String IDs: windowID) {
		System.out.println("window Ids : "+IDs);
	}
	}

}
