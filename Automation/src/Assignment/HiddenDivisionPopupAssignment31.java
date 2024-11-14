package Assignment;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;

public class HiddenDivisionPopupAssignment31 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		while(true) {
			try {
				
		     driver.findElement(By.xpath("//span[text()='January']"));
			    
				
			} 
			catch (Exception e) {
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
				
			}
		}
		
		

	}

}
