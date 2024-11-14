package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureWindowIdAssignment11 {

	public static void main(String[] args) {
		//step1:launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Step2:navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Step3:click on "facebook" link 
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		//Step4:capture the WindowId of both demowebshop and facebook 
		Set<String> windowId = driver.getWindowHandles();
		for(String id:windowId) {
			System.out.println(id);
			
		}
		
		
	}

}
