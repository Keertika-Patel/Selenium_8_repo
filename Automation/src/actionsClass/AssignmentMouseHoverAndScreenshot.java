package actionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;

public class AssignmentMouseHoverAndScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.myntra.com/");
		WebElement kids = driver.findElement(By.linkText("KIDS"));
		
		Actions act = new Actions(driver);
		act.moveToElement(kids).perform();
		
		WebElement ethnicWear = driver.findElement(By.linkText("Ethnic Wear"));
		
		act.moveToElement(ethnicWear).perform();
		ethnicWear.click();
		
		String currentUrl = driver.getCurrentUrl();
		boolean EthnicWearWebPage = currentUrl.contains("https://www.myntra.com/ki-etnhc?f=Gender%3Aboys%2Cboys%20girls&plaEnabled=false");
		System.out.println("Ethnic webpage is displayed: " + EthnicWearWebPage);
		
        TakesScreenshot ts = (TakesScreenshot)driver;//typecating
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ethnicWearWebPage1.png");
		FileHandler.copy(temp, dest);
	}

}
