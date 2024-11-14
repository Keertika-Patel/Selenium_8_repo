package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement uiTestingConcepts = driver.findElement(By.xpath("//*[text()='UI Testing Concepts']"));
		//WebElement uiTestingConcepts = driver.findElement(By.xpath("//*[contains(text(),'UI Testing Concepts')]"));
         uiTestingConcepts.click();
         
         WebElement webTableLink = driver.findElement(By.linkText("Web Table"));
         webTableLink.click();
         
        WebElement dynamicWebTableLink = driver.findElement(By.xpath("//*[text()='Dynamic Web Table']"));
         dynamicWebTableLink.click();
         
         WebElement hpEnvysCurrentDiscount = driver.findElement(By.xpath("//td[text()='HP Envy']/following-sibling::td[3]"));
          System.out.println("Hp Envy's Discount : "+hpEnvysCurrentDiscount.getText());
         
         
	}

}
