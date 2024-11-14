package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment33 {

	public static  void main(String[]args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();	
		
		for(String ids:allWindowIds) {
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
			if(url.contains("amazon")) {
				break;
			}
		}
		Actions action = new Actions(driver);
		action.scrollByAmount(300, 500).perform();//horizontal-xaxis vertical-yaxis
		
		driver.switchTo().defaultContent();
		TakesScreenshot ts = (TakesScreenshot) driver;
        File temp= ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshots/amazon.png");
        FileHandler.copy(temp, dest);
		
		
		
	}

}
