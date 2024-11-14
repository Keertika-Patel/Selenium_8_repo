package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		
	WebElement rightClickLink = driver.findElement(By.xpath("//a[text()='Right Click']"));
	rightClickLink.click();
	
	 WebElement rightClickElement = driver.findElement(By.linkText("Right Click"));
       Actions actions = new Actions(driver);
     actions.contextClick(rightClickElement).perform();
     
		

	}

}
